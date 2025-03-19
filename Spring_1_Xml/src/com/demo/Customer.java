package com.demo;

public class Customer {
    private int cusid;
    private String cusname;
    private int cusprice;
    private String cusadd;
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public int getCusprice() {
		return cusprice;
	}
	public void setCusprice(int cusprice) {
		this.cusprice = cusprice;
	}
	public String getCusadd() {
		return cusadd;
	}
	public void setCusadd(String cusadd) {
		this.cusadd = cusadd;
	}
    
    public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int cusid, String cusname, int cusprice, String cusadd) {
		super();
		this.cusid = cusid;
		this.cusname = cusname;
		this.cusprice = cusprice;
		this.cusadd = cusadd;
	}
	@Override
	public String toString() {
		return "Customer [cusid=" + cusid + ", cusname=" + cusname + ", cusprice=" + cusprice + ", cusadd=" + cusadd
				+ "]";
	}
    
    public void display() {
    	System.out.println(cusid+" "+cusname+" "+cusprice+" "+cusadd);
    }
}
