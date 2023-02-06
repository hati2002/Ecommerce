package com.spring.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class WomenProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String pname;
	private String Pdetails;
	private int pprice;
	private String purl;
	
	public WomenProduct(int id, String pname, String pdetails, int pprice, String purl) {
		super();
		this.id = id;
		this.pname = pname;
		Pdetails = pdetails;
		this.pprice = pprice;
		this.purl = purl;
	}

	

	public WomenProduct() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdetails() {
		return Pdetails;
	}
	public void setPdetails(String pdetails) {
		Pdetails = pdetails;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public String getPurl() {
		return purl;
	}
	public void setPurl(String purl) {
		this.purl = purl;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", Pdetails=" + Pdetails + ", pprice=" + pprice + ", purl="
				+ purl + "]";
	}
	
	
}
