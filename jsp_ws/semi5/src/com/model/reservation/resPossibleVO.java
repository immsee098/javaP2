package com.model.reservation;

import java.sql.Timestamp;

public class resPossibleVO {
	private int planno;
	private Timestamp plan_sdate;
	private Timestamp plan_edate;
	private Timestamp plan_stime;
	private Timestamp plan_etime;
	private int boardno;
	
	public resPossibleVO() {
		super();
	}

	public resPossibleVO(int planno, Timestamp plan_sdate, Timestamp plan_edate, Timestamp plan_stime,
			Timestamp plan_etime, int boardno) {
		super();
		this.planno = planno;
		this.plan_sdate = plan_sdate;
		this.plan_edate = plan_edate;
		this.plan_stime = plan_stime;
		this.plan_etime = plan_etime;
		this.boardno = boardno;
	}

	public int getPlanno() {
		return planno;
	}

	public void setPlanno(int planno) {
		this.planno = planno;
	}

	public Timestamp getPlan_sdate() {
		return plan_sdate;
	}

	public void setPlan_sdate(Timestamp plan_sdate) {
		this.plan_sdate = plan_sdate;
	}

	public Timestamp getPlan_edate() {
		return plan_edate;
	}

	public void setPlan_edate(Timestamp plan_edate) {
		this.plan_edate = plan_edate;
	}

	public Timestamp getPlan_stime() {
		return plan_stime;
	}

	public void setPlan_stime(Timestamp plan_stime) {
		this.plan_stime = plan_stime;
	}

	public Timestamp getPlan_etime() {
		return plan_etime;
	}

	public void setPlan_etime(Timestamp plan_etime) {
		this.plan_etime = plan_etime;
	}

	public int getBoardno() {
		return boardno;
	}

	public void setBoardno(int boardno) {
		this.boardno = boardno;
	}
	
}
