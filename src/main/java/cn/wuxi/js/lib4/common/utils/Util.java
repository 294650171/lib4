package cn.wuxi.js.lib4.common.utils;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Util {
	private static final String BasicCharSet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final int BasicCharSetLen = BasicCharSet.length();

	public static String getRandomStr(int len){
		StringBuffer buffer = new StringBuffer(len);
		for(int i=0;i<len;i++){
			int ra = (int)(Math.random() * BasicCharSetLen);
			buffer.append(BasicCharSet.charAt(ra));
		}
		return buffer.toString();
	}
	
    /**
     * Replaces all occurrence of a specified character in a string with
     * a specified string.
     *
     * @param oldStr     the string to be processed.
     * @param ch         the character to be replaced.
     * @param replaceStr the string that replaces the to-be-replaced
     *                   character.
     *
     * @return           a new string that is derived FROM <code>oldStr</code>
     *                   by replacing every occurrence of <code>ch</code>
     *                   with <code>replaceStr</code>; <code>oldStr</code>
     *                   if <code>ch</code> does not occur in
     *                   <code>oldStr</code>.
     */
    static public String replaceChar(String oldStr, char ch, String replaceStr)
    {
    	if (oldStr == null || oldStr.length() == 0 ||
    	    replaceStr == null || replaceStr.length() == 0){
    		return oldStr;
    	}

    	char b[]  = new char[oldStr.length()];
    	oldStr.getChars(0, oldStr.length(), b, 0);

        char b2[] = new char[replaceStr.length()];
        replaceStr.getChars(0, replaceStr.length(), b2, 0);

        char buffer[] = new char[0];

        boolean found = false;
        int idx = -1, offset=0;;
        for (int i=0; i<b.length; i++) {
            if (b[i] == ch) {
            	if (!found) found = true;
                int size = (i-offset);
                char bb[] = new char[buffer.length + size + b2.length];
	        System.arraycopy(buffer, 0, bb, 0, buffer.length);
	        System.arraycopy(b, offset, bb, buffer.length, size);
	        System.arraycopy(b2, 0, bb, buffer.length + size, b2.length);
	        buffer = bb;
	        offset = i+1;
            }
        }

        if (!found){
        	return oldStr;
        }

        if (offset < b.length) {
            int size = (b.length-offset);
            char bb[] = new char[buffer.length + size];
            System.arraycopy(buffer, 0, bb, 0, buffer.length);
            System.arraycopy(b, offset, bb, buffer.length, size);
	    buffer = bb;
        }

        return new String(buffer);
    }


    /**
     * Replaces all occurrence of a specified string in a string with another
     * specified string.
     *
     * @param oldStr     the string to be processed.
     * @param str        the string to be replaced.
     * @param replaceStr the string that replaces the to-be-replaced string.
     *
     * @return           a new string that is derived FROM <code>oldStr</code>
     *                   by replacing every occurrence of <code>str</code>
     *                   with <code>replaceStr</code>; <code>oldStr</code>
     *                   if <code>str</code> does not occur in
     *                   <code>oldStr</code>.
     */
    static public String replaceString(String oldStr, String str, String replaceStr)
    {
    	if (oldStr == null || oldStr.length() == 0 || str == null || str.length() == 0 ||
    	    replaceStr == null || replaceStr.length() == 0){
    		return oldStr;
    	}

    	int fromIndex=0, idx, len=str.length();
    	StringBuffer sb = new StringBuffer();
    	boolean found = false;
    	while ((idx = oldStr.indexOf(str, fromIndex)) != -1) {
            if (!found){
            	found = true;
            }
            sb.append(oldStr.substring(fromIndex, idx));
            sb.append(replaceStr);
    	    fromIndex = idx + len;
    	}
    	if (!found){
    		return oldStr;
    	}

    	if (fromIndex < oldStr.length()) {
    	    sb.append(oldStr.substring(fromIndex));
    	}

    	return sb.toString();
    }
    
	/**
	 * get String value FROM object
	 * @param obj
	 * @param default_value
	 * @return
	 */
    public static String getString(Object obj,String default_value){
    	String rst = default_value;
    	if(obj!=null){
    		String str = obj.toString().trim();
    		if(!(str.equals("")||str.equalsIgnoreCase("null"))){
    			rst = str;
    		}
    	}
    	return rst;
    }
    
    /**
     * get String value FROM object
     * @param obj
     * @return
     */
    public static String getString(Object obj){
    	return getString(obj,"");
    }
    
	/**
	 * get Integer value FROM object
	 * @param obj
	 * @param default_value
	 * @return
	 */
	public static int getInteger(Object obj, int default_value){
		int rst = default_value;
		if(obj!=null){
			try{
				rst = Integer.parseInt(getString(obj,""));
			}catch(Exception ex){
			}
		}
		return rst;
	}
	
	/**
	 * get Integer value FROM object
	 * @param obj
	 * @return
	 */
	public static int getInteger(Object obj){
		return getInteger(obj,0);
	}
	
	/**
	 * get Boolean value FROM object
	 * @param obj
	 * @param default_value
	 * @return
	 */
	public static boolean getBoolean(Object obj, boolean default_value){
		boolean rst = default_value;
		if(obj!=null){
			try{
				if(getString(obj,"").equalsIgnoreCase("true")){
					rst = true;
				}else if(getString(obj,"").equalsIgnoreCase("false")){
					rst = false;
				}
			}catch(Exception ex){
			}
		}
		return rst;
	}
	
	/**
	 * get Boolean value FROM object
	 * @param obj
	 * @return
	 */
	public static boolean getBoolean(Object obj){
		return getBoolean(obj,false);
	}
	
	/**
	 * get Long value FROM object
	 * @param obj
	 * @param default_value
	 * @return
	 */
	public static long getLong(Object obj, long default_value){
		long rst = default_value;
		if(obj!=null){
			try{
				rst = Long.parseLong(getString(obj,""));
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		return rst;
	}
	
	/**
	 * get Long value FROM object
	 * @param obj
	 * @return
	 */
	public static long getLong(Object obj){
		return getLong(obj,0);
	}
	
	/**
	 * get Float value FROM object
	 * @param obj
	 * @param default_value
	 * @return
	 */
	public static float getFloat(Object obj, float default_value){
		float rst = default_value;
		if(obj!=null){
			try{
				rst = Float.parseFloat(getString(obj,""));
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		return rst;
	}
	
	/**
	 * get Float value FROM object
	 * @param obj
	 * @return
	 */
	public static float getFloat(Object obj){
		return getFloat(obj,0);
	}
	
	/**
	 * get Double value FROM object
	 * @param obj
	 * @param default_value
	 * @return
	 */
	public static double getDouble(Object obj, double default_value){
		double rst = default_value;
		if(obj!=null){
			try{
				rst = Double.parseDouble(getString(obj,""));
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		return rst;
	}
	
	/**
	 * get Double value FROM object
	 * @param obj
	 * @return
	 */
	public static double getDouble(Object obj){
		return getDouble(obj,0);
	}
	
	/**
	 * 
	 * @param f
	 * @param pattern sample 0.0
	 * @return
	 */
	public static String formatDecimal(float f, String pattern){
		DecimalFormat df = new DecimalFormat();
		df.applyPattern(pattern);
		return df.format(f);
	}
	
	public static String requestParamDecode(String param){
		String rst = "";
		try {
			rst = new String(param.getBytes("iso-8859-1"),"utf-8");
			rst = java.net.URLDecoder.decode(rst,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rst;
		
	}
	
	public static boolean isEmail(String email) {
		try {
			// 正常邮箱
			// /^\w+((-\w)|(\.\w))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/
 
			// 含有特殊 字符的 个人邮箱 和 正常邮箱
			// js: 个人邮箱
			// /^[\-!#\$%&'\*\+\\\.\/0-9=\?A-Z\^_`a-z{|}~]+@[\-!#\$%&'\*\+\\\.\/0-9=\?A-Z\^_`a-z{|}~]+(\.[\-!#\$%&'\*\+\\\.\/0-9=\?A-Z\^_`a-z{|}~]+)+$/
 
			// java：个人邮箱
			// [\\w.\\\\+\\-\\*\\/\\=\\`\\~\\!\\#\\$\\%\\^\\&\\*\\{\\}\\|\\'\\_\\?]+@[\\w.\\\\+\\-\\*\\/\\=\\`\\~\\!\\#\\$\\%\\^\\&\\*\\{\\}\\|\\'\\_\\?]+\\.[\\w.\\\\+\\-\\*\\/\\=\\`\\~\\!\\#\\$\\%\\^\\&\\*\\{\\}\\|\\'\\_\\?]+
 
			// 范围 更广的 邮箱验证 “/^[^@]+@.+\\..+$/”
			final String pattern1 = "[\\w.\\\\+\\-\\*\\/\\=\\`\\~\\!\\#\\$\\%\\^\\&\\*\\{\\}\\|\\'\\_\\?]+@[\\w.\\\\+\\-\\*\\/\\=\\`\\~\\!\\#\\$\\%\\^\\&\\*\\{\\}\\|\\'\\_\\?]+\\.[\\w.\\\\+\\-\\*\\/\\=\\`\\~\\!\\#\\$\\%\\^\\&\\*\\{\\}\\|\\'\\_\\?]+";
 
			final Pattern pattern = Pattern.compile(pattern1);
			final Matcher mat = pattern.matcher(email);
			return mat.matches();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
 
	/**
	 * CJYFIXME搜集号段时间:2017-11-28(这个之后的请自行添加) 手机号:目前全国有27种手机号段。
	 * 移动有19个号段：134（0-8）、135、136、137、138、139、147(147（数据卡）)、148(物联网)、150、151、152、
	 * 157、158、159、178、182、183、184、187、188、198。
	 * 联通有11种号段：130、131、132、--145(数据卡)--、146(物联网)、155、156、166、171、175、176、185、
	 * 186。 电信有7个号段：133、--1349--、149、153、173、177、180、181、189、199。 虚拟运营商:
	 * (1).移动:1703、1705、1706 (2).联通:1704、1707、1708、1709、171
	 * (3).电信:1700、1701、1702 卫星通信:1349
	 * <p>
	 * 工业和信息化部公示了2017年第10批“电信网码号资源使用证书”颁发结果，批准同意部分单位提出的电信网码号资源有关申请，
	 * 其中三大运营商均获得相关物联网号段。 移动: (1).198(0-9)号段(公众移动通信网号) (2).148(0-9)号段(物联网业务专用号段)
	 * (3).1440(0-9)号段(物联网网号) (4).(460)13(移动网络识别码) 联通: (1).166(0-9)号段(公众移动通信网号)
	 * (2).146(0-9)号段(物联网业务专用号段) 电信: (1).1740(0-5)号段(卫星移动通信业务号)、
	 * (2).199(0-9)号段(公众移动通信网号)、 (3).1410(0-9)号段(物联网网号)、 (4).(460)59(移动网络识别码)
	 * 由于物联网号段一般用在家用家具上，所以这里不考虑物联网号段,物联网号码的总位数是13或者14还没搞清楚
	 * =========================================================================
	 * ======================
	 * 总结一下:虚拟运营商、数据卡、物联网、卫星通信、移动网络识别码都不作为正常使用的电话号码,所以需要验证的手机号如下:
	 * 130、131、132、133、134(0-8)、135、136、137、138、139 149
	 * 150、151、152、153、155、156、157、158、159 166、 173、175、176、177、178、
	 * 180、181、182、183、184、185、186、187、188、189 198、199
	 */
	private static final String REGEX_MOBILE = "(134[0-8]\\d{7})" + "|(" + "((13([0-3]|[5-9]))" + "|149"
			+ "|15([0-3]|[5-9])" + "|166" + "|17(3|[5-8])" + "|18[0-9]" + "|19[8-9]" + ")" + "\\d{8}" + ")";
 
	/**
	 * 判断是否是手机号
	 * 
	 * @param tel
	 *            手机号
	 * @return boolean true:是 false:否
	 */
	public static boolean isMobile(String tel) {
		return Pattern.matches(REGEX_MOBILE, tel);
	}
}

