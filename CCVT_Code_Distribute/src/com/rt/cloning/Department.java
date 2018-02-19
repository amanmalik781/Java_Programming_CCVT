package com.rt.cloning;
//Hello CCVT, from Amandeep Malik
public class Department implements Cloneable{
	
	private int did;
	private String dname;
	System.out.print("HEllO CCVT FROM AMANDEEP MALIK")
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	public Department(Department dep) {
		// TODO Auto-generated constructor stub
		this.did=dep.did;
		this.dname=dep.dname;
		
	}
	
	@Override
	protected Department clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Department)super.clone();
	}
	

}
