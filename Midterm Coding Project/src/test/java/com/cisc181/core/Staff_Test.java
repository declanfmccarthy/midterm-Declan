package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.util.GregorianCalendar;
import com.cisc181.eNums.eTitle;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	
	static ArrayList<Staff> Staff_List = new ArrayList<Staff>();

	@BeforeClass
	public static void setup() {
		Calendar Declan_Calendar = new GregorianCalendar(1999, 7, 20);
		Date DOB = Declan_Calendar.getTime();
		Date DateOfHire = Declan_Calendar.getTime();
		Staff staff_1 = new Staff("beverly","sue","boyle",DOB,"Cleveland Ave","424-545-2345","blahblah@udel.edu","11-2", 4, 13.00,DateOfHire,eTitle.MRS);
		Staff staff_2 = new Staff("sue","carolyne","smith",DOB,"Cleveland Ave","414-765-4788","suesmith@udel.edu","3-5", 9, 85.00,DateOfHire,eTitle.MRS);
		Staff staff_3 = new Staff("patrick","michael","andrew",DOB,"Cleveland Ave","777-888-7878","patandrew@udel.edu","1-3", 8, 10.00,DateOfHire,eTitle.MR);
		Staff staff_4 = new Staff("lezli","norma","mccarthy",DOB,"Cleveland Ave","999-897-6654","lezlinorma@udel.edu","12-4", 9, 90.00,DateOfHire,eTitle.MRS);
		Staff staff_5 = new Staff("emma","jacobi","jones",DOB,"Cleveland Ave","456-789-6565","jacobi@udel.edu","3-5", 5, 60.00,DateOfHire,eTitle.MRS);
		Staff_List.add(staff_1);
		Staff_List.add(staff_2);
		Staff_List.add(staff_3);
		Staff_List.add(staff_4);
		Staff_List.add(staff_5);
	}
	
	
	@Test
	public void test_staff_average()  {
		double total_salary = 0.0;
		for (int count = 0; count < Staff_List.size(); count++) {
			total_salary += (Staff_List.get(count).getSalary()/5);
		}
		assertEquals(51.6, total_salary, 0.1);
	}	

}
