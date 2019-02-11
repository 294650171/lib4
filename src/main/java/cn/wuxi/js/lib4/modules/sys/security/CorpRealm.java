package cn.wuxi.js.lib4.modules.sys.security;

import cn.wuxi.js.lib4.modules.corp.entity.CorpBasicAccount;
import cn.wuxi.js.lib4.modules.corp.service.CorpBasicAccountService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by aaronhuang on 2019/1/17.
 */
@Service
public class CorpRealm extends AuthorizingRealm {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private CorpBasicAccountService corpBasicAccoutService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermission("user");
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;

        // 校验用户名密码
        CorpBasicAccount user = corpBasicAccoutService.findByTyshxydm(token.getUsername());
        if (user != null) {

            StringBuffer buffer = new StringBuffer();
            for(char ch: token.getPassword()){
                buffer.append(ch);
            }

            logger.debug("user.getId(): {}, user.getLoginName(): {}, user.getPassword(): {}, token.getPassword(): {}",
                    user.getId(), user.getTyshxydm(),user.getPassword(), buffer.toString());

            if(!user.getPassword().equals(buffer.toString())){
                throw new AuthenticationException("msg:密码错误.");
            }

            return new SimpleAuthenticationInfo(new Principal(user, token.isMobileLogin()),
                    user.getPassword(), getName());
        } else {
            return null;
        }
    }

    /**
     * 授权用户信息
     */
    public static class Principal implements Serializable {

        private static final long serialVersionUID = 1L;

        private String id; // 编号
        private String tyshxydm; // 登录名
        private String name; // 姓名
        private boolean mobileLogin; // 是否手机登录


        public Principal(CorpBasicAccount user, boolean mobileLogin) {
            this.id = user.getId();
            this.tyshxydm = user.getTyshxydm();
            this.name = user.getName();
            this.mobileLogin = mobileLogin;
        }


    }
}
