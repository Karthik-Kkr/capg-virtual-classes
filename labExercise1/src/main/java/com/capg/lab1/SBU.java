package com.capg.lab1;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sbu")
public class SBU {
	
	@Value("${sbu.sbuId}")
	public String sbuId;
	@Value("${sbu.sbuName}")
	public String sbuName;
	@Value("${sbu.sbuHead}")
	public String sbuHead;
//	public List<Employee> empList;
//	
//	public List<Employee> getEmpList() {
//		return empList;
//	}
//	public void setEmpList(List<Employee> empList) {
//		this.empList = empList;
//	}
	public SBU() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	public SBU(String sbuId, String sbuName, String sbuHead) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}


	public String getSbuId() {
		return sbuId;
	}
	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	

}
