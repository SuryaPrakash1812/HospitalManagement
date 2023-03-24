package com.model;

public class Pregi {
private String pname;
private String pbg;
private int page;
private String paddress;
private String pgender;

private String pdob;
private Long pnumber;
public Pregi(String pname, String pbg, int page, String paddress, String pgender, String pdop, Long pnumber) {
	super();
	this.pname = pname;
	this.pbg = pbg;
	this.page = page;
	this.paddress = paddress;
	this.pgender = pgender;
	this.pdob = pdop;
	this.pnumber = pnumber;
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
public String getPaddress() {
	return paddress;
}
public void setPaddress(String paddress) {
	this.paddress = paddress;
}
public String getPgender() {
	return pgender;
}
public void setPgender(String pgender) {
	this.pgender = pgender;
}
public String getPdob() {
	return pdob;
}
public void setPdob(String pdop) {
	this.pdob = pdob;
}
public Long getPnumber() {
	return pnumber;
}
public void setPnumber(Long pnumber) {
	this.pnumber = pnumber;
}
}
