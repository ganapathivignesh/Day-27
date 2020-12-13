package com.src;

import javax.validation.constraints.Size;

public class Customer {
  @Size(min=1,message="required")
	private int custid;
	private String custname;
	private String custadd;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustadd() {
		return custadd;
	}
	public void setCustadd(String custadd) {
		this.custadd = custadd;
	}
	
	
	
}
