package com.cisc181.core;
import java.util.UUID;

public class Course {

	private UUID courseID;
	private String courseName;
	private int gradePoints;
	private String major;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	public Course(String Coursename, int Gradepoints, String Major) {
		courseID = UUID.randomUUID();
		courseName = Coursename;
		this.major = Major;
	}
	
	public UUID getCourseID() {
		return courseID;
	}

	public void setCourseID(UUID courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getGradePoints() {
		return gradePoints;
	}

	public void setGradePoints(int gradePoints) {
		this.gradePoints = gradePoints;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}
