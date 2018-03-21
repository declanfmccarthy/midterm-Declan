package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;


public class Student_Test {
	
	private static ArrayList<Student> student_list = new ArrayList<Student>();
	private static ArrayList<Semester> semester_list = new ArrayList<Semester>();
	private static ArrayList<Section> section_list = new ArrayList<Section>();
	private static ArrayList<Course> course_list = new ArrayList<Course>();
	private static ArrayList<Enrollment> enrollment_list = new ArrayList<Enrollment>();
	
	@BeforeClass
	public static void setup() throws Person_Exception {
		Calendar Declan_Calendar = new GregorianCalendar(1999, 7, 20);
		Date DOB = Declan_Calendar.getTime();
		ArrayList<Course> course_list = new ArrayList<Course>();
		Course course_1 = new Course();
		Course course_2 = new Course();
		Course course_3 = new Course();
		course_list.add(course_1);
		course_list.add(course_2);
		course_list.add(course_3);
		ArrayList<Semester> semester_list = new ArrayList<Semester>();
		Semester semester_1 = new Semester();
		Semester semester_2 = new Semester();
		semester_list.add(semester_1);
		semester_list.add(semester_2);
		ArrayList<Section> section_list = new ArrayList<Section>();
		Section section_1 = new Section();
		Section section_2 = new Section();
		Section section_3 = new Section();
		Section section_4 = new Section();
		Section section_5 = new Section();
		Section section_6 = new Section();
		section_list.add(section_1);
		section_list.add(section_2);
		section_list.add(section_3);
		section_list.add(section_4);
		section_list.add(section_5);
		section_list.add(section_6);		
		ArrayList<Student> student_list= new ArrayList<Student>();
		Student student_1 = new Student("Declan","Francis", "McCarthy", DOB, eMajor.CHEM,"cleveland","410-624-8406","dfm@udel.edu");
		Student student_2 = new Student("Deeclan","Francis", "McCarthy", DOB, eMajor.CHEM,"cleveland","410-624-8406","dfm@udel.edu");
		Student student_3 = new Student("Decclan","Francis", "McCarthy", DOB, eMajor.CHEM,"cleveland","410-624-8406","dfm@udel.edu");
		Student student_4 = new Student("Decllan","Francis", "McCarthy", DOB, eMajor.CHEM,"cleveland","410-624-8406","dfm@udel.edu");
		Student student_5 = new Student("Declaan","Francis", "McCarthy", DOB, eMajor.CHEM,"cleveland","410-624-8406","dfm@udel.edu");
		Student student_6 = new Student("Declann","Francis", "McCarthy", DOB, eMajor.CHEM,"cleveland","410-624-8406","dfm@udel.edu");
		Student student_7 = new Student("Declan","Ffrancis", "McCarthy", DOB, eMajor.CHEM,"cleveland","410-624-8406","dfm@udel.edu");
		Student student_8 = new Student("Declan","Frrancis", "McCarthy", DOB, eMajor.CHEM,"cleveland","410-624-8406","dfm@udel.edu");
		Student student_9 = new Student("Declan","Fraancis", "McCarthy", DOB, eMajor.CHEM,"cleveland","410-624-8406","dfm@udel.edu");
		Student student_10 = new Student("Declan","Franncis", "McCarthy", DOB, eMajor.CHEM,"cleveland","410-624-8406","dfm@udel.edu");
		student_list.add(student_1);
		student_list.add(student_2);
		student_list.add(student_3);
		student_list.add(student_4);
		student_list.add(student_5);
		student_list.add(student_6);
		student_list.add(student_7);
		student_list.add(student_8);
		student_list.add(student_9);
		student_list.add(student_10);	
				
	}

	

	@Test
	public void test() {
		ArrayList<Enrollment> enrollment_list = new ArrayList<Enrollment>();
		for(Section section : section_list) {
			for(Student student : student_list) {
				enrollment_list.add(new Enrollment(student.getStudentID(),section.getSectionID()));
			}
		}
		for(Enrollment enrollment : enrollment_list) {
			enrollment.setGrade(3.7);
		}
		
		for(Student student : student_list) {
			double total_points = 0;
			int credit_hours = 0;
			
			for (Enrollment enrollment : enrollment_list) {
				if (enrollment.getStudentID() == student.getStudentID()) {
					for (Section section : section_list) {
						if (section.getSectionID() == enrollment.getSectionID()) {
							for (Course course : course_list) {
								if (course.getCourseID() == section.getCourseID()) {
									credit_hours += course.getGradePoints();
									total_points += (enrollment.getGrade() * course.getGradePoints());
								}
							}
						}
					}
				}
			}
			
			double gpa = (total_points/credit_hours);
			
			assertEquals(3.7,gpa,0);
		}
		
		for(Course course : course_list) {
			double course_grade_total = 0;
			int num_students = 0;
			for(Enrollment enrollment : enrollment_list) {
				for(Section section : section_list) {
					if(enrollment.getSectionID() == section.getSectionID()) {
						if(course.getCourseID() == section.getCourseID()) {
							course_grade_total += enrollment.getGrade();
							num_students++;
						}
					}
				}
			}
			double average_grade = course_grade_total/num_students;
			assertEquals(3.7,average_grade,0);
		}
		
	}
}



