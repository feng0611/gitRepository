package com.tuling.mybatis.entity;

public class student {
	 private Integer id  ;
	 private String ename;
	 private Double esal;
	 private String eaddress ;
	 public student () {}
	public student(Integer id, String ename, Double esal, String eaddress) {
		super();
		this.id = id;
		this.ename = ename;
		this.esal = esal;
		this.eaddress = eaddress;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getEsal() {
		return esal;
	}
	public void setEsal(Double esal) {
		this.esal = esal;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", ename=" + ename + ", esal=" + esal + ", eaddress=" + eaddress + "]";
	}

}
