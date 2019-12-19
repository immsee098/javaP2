package com.model.reservation;

import java.sql.Timestamp;

public class resPlanVO {
	private int resCalNo;
	private Timestamp res_sdate;
	private Timestamp res_edate;
	private Timestamp res_stime;
	private Timestamp res_etime;
	private int resno;
	public resPlanVO() {
		super();
	}
	
	
	
	public resPlanVO(int resCalNo, Timestamp res_sdate, Timestamp res_edate, Timestamp res_stime, Timestamp res_etime,
			int resno) {
		super();
		this.resCalNo = resCalNo;
		this.res_sdate = res_sdate;
		this.res_edate = res_edate;
		this.res_stime = res_stime;
		this.res_etime = res_etime;
		this.resno = resno;
	}


	public int getResCalNo() {
		return resCalNo;
	}
	
	public void setResCalNo(int resCalNo) {
		this.resCalNo = resCalNo;
	}
	public Timestamp getRes_sdate() {
		return res_sdate;
	}
	public void setRes_sdate(Timestamp res_sdate) {
		this.res_sdate = res_sdate;
	}
	public Timestamp getRes_edate() {
		return res_edate;
	}
	public void setRes_edate(Timestamp res_edate) {
		this.res_edate = res_edate;
	}
	public Timestamp getRes_stime() {
		return res_stime;
	}
	public void setRes_stime(Timestamp res_stime) {
		this.res_stime = res_stime;
	}
	public Timestamp getRes_etime() {
		return res_etime;
	}
	public void setRes_etime(Timestamp res_etime) {
		this.res_etime = res_etime;
	}
	public int getResno() {
		return resno;
	}
	public void setResno(int resno) {
		this.resno = resno;
	}
	
	
	
}
