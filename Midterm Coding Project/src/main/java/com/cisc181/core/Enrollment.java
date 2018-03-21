package com.cisc181.core;
import java.util.Scanner;
import java.util.UUID;


public class Enrollment {

	private UUID sectionID;
	private UUID studentID;
	private UUID enrollmentID;
	private double grade;
	

	public UUID getSectionID() {
		return sectionID;
	}


	public void setSectionID(UUID sectionID) {
		this.sectionID = sectionID;
	}


	public UUID getStudentID() {
		return studentID;
	}


	public void setStudentID(UUID studentID) {
		this.studentID = studentID;
	}


	public UUID getEnrollmentID() {
		return enrollmentID;
	}


	public void setEnrollmentID(UUID enrollmentID) {
		this.enrollmentID = enrollmentID;
	}


	public double getGrade() {
		return grade;
	}


	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
	private Enrollment() {
		// TODO Auto-generated constructor stub
	}
	

	public Enrollment(UUID studentID, UUID sectionID) {
		super();
		enrollmentID = UUID.randomUUID();
	}

	
	public void set_Grade(double g) {
		grade = g;
	}


}
