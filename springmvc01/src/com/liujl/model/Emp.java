package com.liujl.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Emp {
	private int empId;
	private String empName;
	private String dept;
	private Date inhireDate;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Date getInhireDate() {
		return inhireDate;
	}
	public void setInhireDate(Date inhireDate) {
		this.inhireDate = inhireDate;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", dept="
				+ dept + ", inhireDate=" +( new SimpleDateFormat("yyyy-MM-dd HH:MM:SS").format(inhireDate) )+ "]";
	}
	
}
