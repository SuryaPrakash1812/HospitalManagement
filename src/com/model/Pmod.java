package com.model;

public class Pmod {
private int pid;
private String pname;
private String pbg;
private int page;
private String pres1;
private String presc;
public Pmod(String pres1) {
	super();
	this.pres1 = pres1;
}
public Pmod(int pid, String pname, String presc) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.presc = presc;
}
public String getPres1() {
	return pres1;
}
public void setPres1(String pres) {
	this.pres1 = pres;
}
public String getPresc() {
	return presc;
}
public void setPresc(String presc) {
	this.presc = presc;
}
public Pmod(int pid, String pname, String pbg, int page,String presc) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pbg = pbg;
	this.page = page;
	this.presc=presc;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPbg() {
	return pbg;
}
public void setPbg(String pbg) {
	this.pbg = pbg;
}
public int getPage() {
	return page;
}
public void setPage(int page) {
	this.page = page;
}

}
