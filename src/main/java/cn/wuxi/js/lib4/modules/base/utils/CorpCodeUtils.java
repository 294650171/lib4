package cn.wuxi.js.lib4.modules.base.utils;

public class CorpCodeUtils {

	public CorpCodeUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static final String parseOrgCode(String corpCreditCode){
		String rst = corpCreditCode.substring(8, 16) + "-"
			      + corpCreditCode.substring(16, 17);
		return rst;
		
	}

}
