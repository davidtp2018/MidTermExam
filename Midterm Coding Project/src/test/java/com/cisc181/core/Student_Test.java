package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Section> sections = new ArrayList<Section>();

	// Date for DOB purposes for constructors later on
	public static Date newDate(int yr, int mon, int day) {
		Calendar cal2 = Calendar.getInstance();
		cal2.set(yr, mon, day);
		return cal2.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException {
		
		//Courses that were created 
		Course bio = new Course("MicroBiology II", 100, eMajor.BUSINESS);
		Course crju = new Course("Criminology in the US", 100, eMajor.CHEM);
		Course chem = new Course("Analytical Chemistry", 100, eMajor.PHYSICS);
		
		//Adds the Courses to the ArrayList 
		courses.add(bio);
		courses.add(crju);
		courses.add(chem);
		
		//Semesters for the Fall and Spring 
		Semester fall16 = new Semester(newDate(2016, 8, 30), newDate(2016, 12, 9));
		Semester spring17 = new Semester(newDate(2017, 2, 10), newDate(2017, 5, 26));
		
		//Adds the Semesters to the ArrayList
		semesters.add(spring17);
		semesters.add(fall16);
		
		//Sections that were created for Fall and Spring 
		Section fallBio = new Section(bio.getCourseID(), fall16.getSemesterID(), 234);
		Section fallCrju = new Section(crju.getCourseID(), fall16.getSemesterID(), 213);
		Section fallChem = new Section(chem.getCourseID(), fall16.getSemesterID(), 423);
		
		Section springBio = new Section(bio.getCourseID(), spring17.getSemesterID(), 412);
		Section springCrju = new Section(crju.getCourseID(), spring17.getSemesterID(), 241);
		Section springChem = new Section(chem.getCourseID(), spring17.getSemesterID(), 100);
		
		//Adds the Sections to the ArrayList
		sections.add(fallBio);
		sections.add(fallCrju);
		sections.add(fallChem);
		sections.add(springBio);
		sections.add(springCrju);
		sections.add(springChem);
		
		//Creates 10 Student Records 
		Student stud1 = new Student("Jackson", "Lewis", "Duff", newDate(1995, 2, 23), eMajor.COMPSI,
				"10 Lewis Road", "(232)-294-1254", "daddy@yahoo.com");
		
		Student stud2 = new Student("Grant", "Ralf", "Nickson", newDate(1996, 12, 19), eMajor.BUSINESS,
				"12 Ranksack Street", "(343)-332-0504", "sonny@udel.edu");
		
		Student stud3 = new Student("Froster", "William", "Persons", newDate(1994, 11, 9), eMajor.CHEM,
				"23 Stretown Road", "(203)-225-0900", "willam@udel.edu");
		
		Student stud4 = new Student("Ralf", "Chris", "Rock", newDate(1995, 5, 5), eMajor.NURSING,
				"15 Reten Street", "(342)-125-6542", "ret@udel.edu");
		
		Student stud5 = new Student("Thomas", "Sander", "McDonald", newDate(1997, 3,27), eMajor.PHYSICS,
				"13 Landing Road", "(305)-334-0964", "lewis@aol.com");
		
		Student stud6 = new Student("Brandon", "Flugger", "Brown", newDate(1996, 7, 31), eMajor.NURSING,
				"53 Marsson Lane", "(355)-656-4054", "jugger@udel.edu");
		
		Student stud7 = new Student("Lee", "McWade", "Jones", newDate(1997, 4, 14), eMajor.PHYSICS,
				"63 Russell Square", "(253)-885-2330", "rusel@yahoo.com");
		
		Student stud8 = new Student("Marvin", "Ret", "Lawson", newDate(1995, 9, 8), eMajor.BUSINESS,
				"70 Luster Court", "(555)-252-6445", "rankin@aol.com");
		
		Student stud9 = new Student("William", "Bret", "Johnson", newDate(1995, 3, 31), eMajor.COMPSI,
				"25 Overlow Court", "(353)-226-4039", "setre@udel.edu");
		
		Student stud10 = new Student("David", "Randy", "Cartrell", newDate(1994, 11, 28), eMajor.CHEM,
				"76 Ranker Lane", "(205)-103-4405", "tommy@verizon.net");
		
		
		//Adds the Students to the ArrayList
		students.add(stud1);
		students.add(stud2);
		students.add(stud3);
		students.add(stud4);
		students.add(stud5);
		students.add(stud6);
		students.add(stud7);
		students.add(stud8);
		students.add(stud9);
		students.add(stud10);
		
		}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}