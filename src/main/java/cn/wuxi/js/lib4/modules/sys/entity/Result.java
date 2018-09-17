package cn.wuxi.js.lib4.modules.sys.entity;

public class Result {

	public static final int SUCCESS = 0;

	private int code = SUCCESS;
	private String msg = "OK";

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
