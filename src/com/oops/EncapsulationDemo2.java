package com.oops;

public class EncapsulationDemo2 {
	private int sid;
	private String sname;
	private short sage;
	private double smarks;
	public EncapsulationDemo2() {
	}
	public EncapsulationDemo2(int sid, String sname, short sage, double smarks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.smarks = smarks;
	}
	public String toString() {
		return "EncapsulationDemo2 data  [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", smarks=" + smarks + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public short getSage() {
		return sage;
	}
	public void setSage(short sage) {
		this.sage = sage;
	}
	public double getSmarks() {
		return smarks;
	}
	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}
}
