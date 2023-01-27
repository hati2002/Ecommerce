package com.spring.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String uname;
	private String umail;
	private int psw;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUmail() {
		return umail;
	}
	public void setUmail(String umail) {
		this.umail = umail;
	}
	public int getPsw() {
		return psw;
	}
	public void setPsw(int psw) {
		this.psw = psw;
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", umail=" + umail + ", psw=" + psw + "]";
	}
	
	
}
