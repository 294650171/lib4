/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.sys.utils;

import java.util.List;

import cn.wuxi.js.lib4.modules.corp.dao.CorpBasicAccountDao;
import cn.wuxi.js.lib4.modules.corp.entity.CorpBasicAccount;
import cn.wuxi.js.lib4.modules.sys.security.UsernamePasswordToken;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.UnavailableSecurityManagerException;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.wuxi.js.lib4.common.service.BaseService;
import cn.wuxi.js.lib4.common.utils.CacheUtils;
import cn.wuxi.js.lib4.common.utils.SpringContextHolder;

import cn.wuxi.js.lib4.modules.sys.dao.AreaDao;
import cn.wuxi.js.lib4.modules.sys.dao.MenuDao;
import cn.wuxi.js.lib4.modules.sys.dao.OfficeDao;
import cn.wuxi.js.lib4.modules.sys.dao.RoleDao;
import cn.wuxi.js.lib4.modules.sys.dao.UserDao;
import cn.wuxi.js.lib4.modules.sys.entity.Area;
import cn.wuxi.js.lib4.modules.sys.entity.Menu;
import cn.wuxi.js.lib4.modules.sys.entity.Office;
import cn.wuxi.js.lib4.modules.sys.entity.Role;
import cn.wuxi.js.lib4.modules.sys.entity.User;
import cn.wuxi.js.lib4.modules.sys.security.SystemAuthorizingRealm.Principal;

/**
 * 用户工具类
 * @author ThinkGem
 * @version 2013-12-05
 */
public class UserUtils {
	
	private static Logger logger = LoggerFactory.getLogger(UserUtils.class);

	private static UserDao userDao = SpringContextHolder.getBean(UserDao.class);
	private static RoleDao roleDao = SpringContextHolder.getBean(RoleDao.class);
	private static MenuDao menuDao = SpringContextHolder.getBean(MenuDao.class);
	private static AreaDao areaDao = SpringContextHolder.getBean(AreaDao.class);
	private static OfficeDao officeDao = SpringContextHolder.getBean(OfficeDao.class);
	private static CorpBasicAccountDao corpBasicAccoutDao = SpringContextHolder.getBean(CorpBasicAccountDao.class);
	
	public static final int EmployeeIDLen = 5;

	public static final String USER_CACHE = "userCache";
	public static final String USER_CACHE_ID_ = "id_";
	public static final String USER_CACHE_LOGIN_NAME_ = "ln";
	public static final String USER_CACHE_LIST_BY_OFFICE_ID_ = "oid_";
	
	public static final String CACHE_AUTH_INFO = "authInfo";
	public static final String CACHE_ROLE_LIST = "roleList";
	public static final String CACHE_MENU_LIST = "menuList";
	public static final String CACHE_AREA_LIST = "areaList";
	public static final String CACHE_OFFICE_LIST = "officeList";
	public static final String CACHE_OFFICE_ALL_LIST = "officeAllList";
	
	/**
	 * 根据ID获取用户
	 * @param id
	 * @return 取不到返回null
	 */
	public static User get(String id){
		return getByLoginKeyword(id, true);
	}
	
	/**
	 * 根据登录名获取用户
	 * @param loginName
	 * @return 取不到返回null
	 */
	public static User getByLoginName(String loginName){
		
		return getByLoginKeyword(loginName, false);
	}
	
	
	public static User getByLoginKeyword(String keyword, boolean isId){
		User user = (User)CacheUtils.get(USER_CACHE, USER_CACHE_LOGIN_NAME_ + keyword);
		
		if (user == null){
			if(isId){
				user = userDao.get(keyword);
			}else{
				user = userDao.getByLoginName(new User(null, keyword));
			}

			logger.debug("login : "+keyword+", user == null? "+(user == null));
			
			if(user!=null){
				user.setIsSysUser("1");
			}else{
				user = getNoneSysUser(keyword);
			}
			
			if (user == null){
				return null;
			}else{
				
				logger.debug("user.getIsSysUser() : "+user.getIsSysUser()
						+", user.getId(): "+user.getId()
						+", user.getLoginName(): "+user.getLoginName());

				if(user.getIsSysUser().equals("1")){
					user.setRoleList(roleDao.findList(new Role(user)));
				}else{
//					String roleId = "2";
					Role role = new Role();
					role.setEnname("corp_basic_account");
					user.setRoleList(roleDao.findList(role));

					
				}
			}
			
			CacheUtils.put(USER_CACHE, USER_CACHE_ID_ + user.getId(), user);
			CacheUtils.put(USER_CACHE, USER_CACHE_LOGIN_NAME_ + user.getLoginName(), user);
		}
		return user;
	}
	
	public static User getNoneSysUser(String userName){
		
//		String userNameEx = expandUsername(userName);
		
		User user = getExistingNoneSysUser(userName);
		
		if(user==null){
			//if not exists, get from temployee_synch
			/*
			Employee temployee = temployeeDao.findByPsnid(userNameEx);
			
			if(temployee!=null){
				
				Employee employee = new Employee();
				employee.setId(temployee.getPsnid());
				employee.setIsNewRecord(true);
				employee.setPhone(temployee.getPhone());
				employee.setPhoneShort(temployee.getPhoneShort());
				employee.setPsnname(temployee.getPsnname());
				employee.setPassword("8888");
				
				employeerDao.insert(employee);
				
				user = getExistingNoneSysUser(userNameEx);
			}
			*/
		}
		
		return user;		
	}
	
	public static User getExistingNoneSysUser(String userName){
		
		User user = null;
		CorpBasicAccount corp = null;
		if(corp == null){
			corp = corpBasicAccoutDao.findByTyshxydm(userName);
		}
		if(corp!=null){
			user = new User();
			user.setId(corp.getTyshxydm());
			user.setLoginName(corp.getTyshxydm());
			user.setPassword(corp.getPassword());
			user.setNo(corp.getId());
			user.setName(corp.getName());
			user.setUserType(UsernamePasswordToken.USER_TYPE_CORP);
			
			user.setCorpBasicAccount(corp);
			
			user.setIsSysUser("0");
		}
		
		return user;		
	}
	
	private static String expandUsername(String username){
		String rst = username;
		if(username.length()<EmployeeIDLen){
			while(rst.length()<EmployeeIDLen){
				rst = '0' + rst;
			}
		}
		return rst;
	}
	
	/**
	 * 清除当前用户缓存
	 */
	public static void clearCache(){
		removeCache(CACHE_AUTH_INFO);
		removeCache(CACHE_ROLE_LIST);
		removeCache(CACHE_MENU_LIST);
		removeCache(CACHE_AREA_LIST);
		removeCache(CACHE_OFFICE_LIST);
		removeCache(CACHE_OFFICE_ALL_LIST);
		UserUtils.clearCache(getUser());
	}
	
	/**
	 * 清除指定用户缓存
	 * @param user
	 */
	public static void clearCache(User user){
		CacheUtils.remove(USER_CACHE, USER_CACHE_ID_ + user.getId());
		CacheUtils.remove(USER_CACHE, USER_CACHE_LOGIN_NAME_ + user.getLoginName());
		CacheUtils.remove(USER_CACHE, USER_CACHE_LOGIN_NAME_ + user.getOldLoginName());
		if (user.getOffice() != null && user.getOffice().getId() != null){
			CacheUtils.remove(USER_CACHE, USER_CACHE_LIST_BY_OFFICE_ID_ + user.getOffice().getId());
		}
	}
	
	public static void clearCache(String user){
		CacheUtils.remove(USER_CACHE, USER_CACHE_ID_ + user);
		CacheUtils.remove(USER_CACHE, USER_CACHE_LOGIN_NAME_ + user);
		CacheUtils.remove(USER_CACHE, USER_CACHE_LOGIN_NAME_ + user);
	}
	
	/**
	 * 获取当前用户
	 * @return 取不到返回 new User()
	 */
	public static User getUser(){
		Principal principal = getPrincipal();
		if (principal!=null){
			User user = get(principal.getId());
			if (user != null){
				return user;
			}
			return new User();
		}
		// 如果没有登录，则返回实例化空的User对象。
		return new User();
	}

	/**
	 * 获取当前用户角色列表
	 * @return
	 */
	public static List<Role> getRoleList(){
		@SuppressWarnings("unchecked")
		List<Role> roleList = (List<Role>)getCache(CACHE_ROLE_LIST);
		if (roleList == null){
			User user = getUser();
			if (user.isAdmin()){
				roleList = roleDao.findAllList(new Role());
			}else{
				Role role = new Role();
				role.getSqlMap().put("dsf", BaseService.dataScopeFilter(user.getCurrentUser(), "o", "u"));
				roleList = roleDao.findList(role);
			}
			putCache(CACHE_ROLE_LIST, roleList);
		}
		return roleList;
	}
	
	/**
	 * 获取当前用户授权菜单
	 * @return
	 */
	public static List<Menu> getMenuList(){
		@SuppressWarnings("unchecked")
		List<Menu> menuList = (List<Menu>)getCache(CACHE_MENU_LIST);
		if (menuList == null){
			User user = getUser();
			if (user.isAdmin()){
				menuList = menuDao.findAllList(new Menu());
			}else if(user.isCorpAccount()){
				Role r = new Role();
				r.setId("a8b2a30dad94413189b803f325289028");
				menuList = menuDao.findByRoleId(r);
			}else{
				Menu m = new Menu();
				m.setUserId(user.getId());
				menuList = menuDao.findByUserId(m);
			}
			putCache(CACHE_MENU_LIST, menuList);
		}
		return menuList;
	}
	
	/**
	 * 获取当前用户授权的区域
	 * @return
	 */
	public static List<Area> getAreaList(){
		@SuppressWarnings("unchecked")
		List<Area> areaList = (List<Area>)getCache(CACHE_AREA_LIST);
		if (areaList == null){
			areaList = areaDao.findAllList(new Area());
			putCache(CACHE_AREA_LIST, areaList);
		}
		return areaList;
	}
	
	/**
	 * 获取当前用户有权限访问的部门
	 * @return
	 */
	public static List<Office> getOfficeList(){
		@SuppressWarnings("unchecked")
		List<Office> officeList = (List<Office>)getCache(CACHE_OFFICE_LIST);
		if (officeList == null){
			User user = getUser();
			if (user.isAdmin()){
				officeList = officeDao.findAllList(new Office());
			}else{
				Office office = new Office();
				office.getSqlMap().put("dsf", BaseService.dataScopeFilter(user, "a", ""));
				officeList = officeDao.findList(office);
			}
			putCache(CACHE_OFFICE_LIST, officeList);
		}
		return officeList;
	}

	/**
	 * 获取当前用户有权限访问的部门
	 * @return
	 */
	public static List<Office> getOfficeAllList(){
		@SuppressWarnings("unchecked")
		List<Office> officeList = (List<Office>)getCache(CACHE_OFFICE_ALL_LIST);
		if (officeList == null){
			officeList = officeDao.findAllList(new Office());
		}
		return officeList;
	}
	
	/**
	 * 获取授权主要对象
	 */
	public static Subject getSubject(){
		return SecurityUtils.getSubject();
	}
	
	/**
	 * 获取当前登录者对象
	 */
	public static Principal getPrincipal(){
		try{
			Subject subject = SecurityUtils.getSubject();
			Principal principal = (Principal)subject.getPrincipal();
			if (principal != null){
				return principal;
			}
//			subject.logout();
		}catch (UnavailableSecurityManagerException e) {
			
		}catch (InvalidSessionException e){
			
		}
		return null;
	}
	
	public static Session getSession(){
		try{
			Subject subject = SecurityUtils.getSubject();
			Session session = subject.getSession(false);
			if (session == null){
				session = subject.getSession();
			}
			if (session != null){
				return session;
			}
//			subject.logout();
		}catch (InvalidSessionException e){
			
		}
		return null;
	}
	
	// ============== User Cache ==============
	
	public static Object getCache(String key) {
		return getCache(key, null);
	}
	
	public static Object getCache(String key, Object defaultValue) {
//		Object obj = getCacheMap().get(key);
		Object obj = getSession().getAttribute(key);
		return obj==null?defaultValue:obj;
	}

	public static void putCache(String key, Object value) {
//		getCacheMap().put(key, value);
		getSession().setAttribute(key, value);
	}

	public static void removeCache(String key) {
//		getCacheMap().remove(key);
		getSession().removeAttribute(key);
	}
	
//	public static Map<String, Object> getCacheMap(){
//		Principal principal = getPrincipal();
//		if(principal!=null){
//			return principal.getCacheMap();
//		}
//		return new HashMap<String, Object>();
//	}
	
}
