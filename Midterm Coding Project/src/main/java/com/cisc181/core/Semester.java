package com.cisc181.core;
import java.util.Date;
import java.util.UUID;

public class Semester {

	private UUID semesterID;
	private Date startDate;
	private Date endDate;
	
	
	public Semester() {
		// TODO Auto-generated constructor stub
	}


	public UUID getSemesterID() {
		return semesterID;
	}


	public void setSemesterID(UUID semesterID) {
		this.semesterID = semesterID;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	
	
}
