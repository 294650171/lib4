package cn.wuxi.js.lib4.crawler.mohurd.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RegStaffs implements Serializable {

	private static final long serialVersionUID = 1L;

	private int total;

	private int totalPage;

	private int pageSize;

	private List<RegStaffVO> staffs = new ArrayList<RegStaffVO>();

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<RegStaffVO> getStaffs() {
		return staffs;
	}

	public void setStaffs(List<RegStaffVO> staffs) {
		this.staffs = staffs;
	}

}
