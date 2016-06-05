package com.FlappyTicket.Model;

public class Session {

	private int sid;
	
	private int cid;
	
	private int mid;
	
	private int seid;
	
	private String sName;
	
	private String sTimeThrough;
	
	private int sPrice;
	
	private String sDay;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getSeid() {
		return seid;
	}

	public void setSeid(int seid) {
		this.seid = seid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsTimeThrough() {
		return sTimeThrough;
	}

	public void setsTimeThrough(String sTimeThrough) {
		this.sTimeThrough = sTimeThrough;
	}
	
	public Session(int sid, int cid, int mid, int seid, String sName, String sTimeThrough, int sPrice, String sDay) {
		this.setSid(sid);
		this.setCid(cid);
		this.setMid(mid);
		this.setSeid(seid);
		this.setsName(sName);
		this.setsTimeThrough(sTimeThrough);
		this.setsPrice(sPrice);
		this.setsDay(sDay);
	}
	public Session() {
	}

	public int getsPrice() {
		return sPrice;
	}

	public void setsPrice(int sPrice) {
		this.sPrice = sPrice;
	}

	public String getsDay() {
		return sDay;
	}

	public void setsDay(String sDay) {
		this.sDay = sDay;
	}
	
}