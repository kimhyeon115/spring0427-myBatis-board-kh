package com.rlagus.boardKh.dto;

import java.sql.Timestamp;

public class FbMemberDto {
	
	private String mid;
	private String mpw;
	private String mname;
	private String memail;
	private Timestamp mdate;
	public FbMemberDto() {
		super();
	}
	public FbMemberDto(String mid, String mpw, String mname, String memail, Timestamp mdate) {
		super();
		this.mid = mid;
		this.mpw = mpw;
		this.mname = mname;
		this.memail = memail;
		this.mdate = mdate;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpw() {
		return mpw;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public Timestamp getMdate() {
		return mdate;
	}
	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}
	
}
