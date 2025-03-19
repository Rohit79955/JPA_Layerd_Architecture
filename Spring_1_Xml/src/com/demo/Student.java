package com.demo;

import java.util.List;

public class Student {
    private int stid;
    private String stname;
    private int stmarks;
    private String staddress;
    private List<String> subjects;
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public int getStmarks() {
		return stmarks;
	}
	public void setStmarks(int stmarks) {
		this.stmarks = stmarks;
	}
	public String getStaddress() {
		return staddress;
	}
	public void setStaddress(String staddress) {
		this.staddress = staddress;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public Student(int stid, String stname, int stmarks, String staddress, List<String> subjects) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.stmarks = stmarks;
		this.staddress = staddress;
		this.subjects = subjects;
	}
    
    public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stname=" + stname + ", stmarks=" + stmarks + ", staddress=" + staddress
				+ ", subjects=" + subjects + "]";
	}
    
    
}
