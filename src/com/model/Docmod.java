package com.model;

public class Docmod {
private String duname;
private String dpassword;


public String getDuname() {
	return duname;
}


public void setDuname(String dname) {
	this.duname = dname;
}


public String getDpassword() {
	return dpassword;
}


public void setDpassword(String dpassword) {
	this.dpassword = dpassword;
}


public Docmod(String duname, String dpassword) {
	super();
	this.duname = duname;
	this.dpassword=dpassword;
}

}
