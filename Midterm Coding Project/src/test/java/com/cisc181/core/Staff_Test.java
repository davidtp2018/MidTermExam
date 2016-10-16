package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	// Creates the ArrayList of Staff

	static ArrayList<Staff> staff1 = new ArrayList<Staff>();

	public static Date newDate(int yr, int mon, int day) {
		Calendar cal2 = Calendar.getInstance();
		cal2.set(yr, mon, day);
		return cal2.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException {

		// Add five people to the ArrayList of Staff

		staff1.add(new Staff("Ralf", "Thomas", "Landing", newDate(1965, 8, 12), "Roxay Street", "(123)-324-5335",
				"pete@hotmail.com", "TH 8:30-10:00am", 1, 54000, newDate(2013, 4, 6), eTitle.MR));

		staff1.add(new Staff("Bete", "Tane", "Flowers", newDate(1976, 7, 25), "Rankin Street", "(234)-546-8789",
				"wief@hotmail.com", "M 4:00-5:00pm", 3, 38000, newDate(2013, 5, 21), eTitle.MR));

		staff1.add(new Staff("Jenifer", "Mae", "Cloude", newDate(1974, 10, 12), "Bobet Street", "(304)-543-4300",
				"master@hotmail.com", "F 2:00-5:00pm", 5, 53500, newDate(1978, 12, 14), eTitle.MRS));

		staff1.add(new Staff("Taylor", "Sara", "Coder", newDate(1967, 9, 29), "Rench Street", "(690)-290-3489",
				"singin@hotmail.com", "W 8:00-10:00am", 2, 62300, newDate(2014, 6, 12), eTitle.MR));

		staff1.add(new Staff("Taylor", "Sara", "Coder", newDate(1967, 9, 29), "Renden Street", "(432)-636-6436",
				"goode@hotmail.com", "T 8:25-10:50am", 4, 49300, newDate(2004, 1, 12), eTitle.MRS));
	}

	@Test
	public void testStaffSalary() throws PersonException {
		double sum = 0;
		for (Staff avgStaff : staff1) {
			sum += avgStaff.getSalary();
		}
		double average = sum / staff1.size();
		assertEquals(average, 51420, .01);
	}
}
