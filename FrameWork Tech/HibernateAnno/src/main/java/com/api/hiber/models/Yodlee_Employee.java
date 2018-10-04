package com.api.hiber.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="YODLEE_EMPLOYEE")
public class Yodlee_Employee {
	
	@Id
	@Column(name="Employee_Id")
	private int empId;
	
	@Column(name="Employee_Name", nullable=false, length=50)
	private String empName;
	
	@ManyToOne
	@JoinColumn(name="Event_Id")
	private Yodlee_Event event;

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

	public Yodlee_Event getEvent() {
		return event;
	}

	public void setEvent(Yodlee_Event event) {
		this.event = event;
	}
	
}
