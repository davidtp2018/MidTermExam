package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Section> sections = new ArrayList<Section>();

	// Enrollment Arrays for each of the Students
	static ArrayList<Enrollment> enroll1F = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> enroll1S = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> enroll2F = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> enroll2S = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> enroll3F = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> enroll3S = new ArrayList<Enrollment>();

	// Date for DOB purposes for constructors later on
	public static Date newDate(int yr, int mon, int day) {
		Calendar cal2 = Calendar.getInstance();
		cal2.set(yr, mon, day);
		return cal2.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException {

		// Courses that were created
		Course bio = new Course(UUID.randomUUID(), "MicroBiology II", 100, eMajor.BUSINESS);
		Course crju = new Course(UUID.randomUUID(), "Criminology in the US", 100, eMajor.CHEM);
		Course chem = new Course(UUID.randomUUID(), "Analytical Chemistry", 100, eMajor.PHYSICS);

		// Adds the Courses to the ArrayList
		courses.add(bio);
		courses.add(crju);
		courses.add(chem);

		// Semesters for the Fall and Spring
		Semester fall16 = new Semester(UUID.randomUUID(), newDate(2016, 8, 30), newDate(2016, 12, 9));
		Semester spring17 = new Semester(UUID.randomUUID(), newDate(2017, 2, 10), newDate(2017, 5, 26));

		// Adds the Semesters to the ArrayList
		semesters.add(spring17);
		semesters.add(fall16);

		// Sections that were created for Fall and Spring
		Section fallBio = new Section(bio.getCourseID(), fall16.getSemesterID(), UUID.randomUUID(), 234);
		Section fallCrju = new Section(crju.getCourseID(), fall16.getSemesterID(), UUID.randomUUID(), 213);
		Section fallChem = new Section(chem.getCourseID(), fall16.getSemesterID(), UUID.randomUUID(), 423);

		Section springBio = new Section(bio.getCourseID(), spring17.getSemesterID(), UUID.randomUUID(), 412);
		Section springCrju = new Section(crju.getCourseID(), spring17.getSemesterID(), UUID.randomUUID(), 241);
		Section springChem = new Section(chem.getCourseID(), spring17.getSemesterID(), UUID.randomUUID(), 100);

		// Adds the Sections to the ArrayList
		sections.add(fallBio);
		sections.add(fallCrju);
		sections.add(fallChem);
		sections.add(springBio);
		sections.add(springCrju);
		sections.add(springChem);

		// Creates 10 Student Records
		Student stud1 = new Student("Jackson", "Lewis", "Duff", newDate(1995, 2, 23), eMajor.COMPSI, "10 Lewis Road",
				"(232)-294-1254", "daddy@yahoo.com", UUID.randomUUID());

		Student stud2 = new Student("Grant", "Ralf", "Nickson", newDate(1996, 12, 19), eMajor.BUSINESS,
				"12 Ranksack Street", "(343)-332-0504", "sonny@udel.edu", UUID.randomUUID());

		Student stud3 = new Student("Froster", "William", "Persons", newDate(1994, 11, 9), eMajor.CHEM,
				"23 Stretown Road", "(203)-225-0900", "willam@udel.edu", UUID.randomUUID());

		Student stud4 = new Student("Ralf", "Chris", "Rock", newDate(1995, 5, 5), eMajor.NURSING, "15 Reten Street",
				"(342)-125-6542", "ret@udel.edu", UUID.randomUUID());

		Student stud5 = new Student("Thomas", "Sander", "McDonald", newDate(1997, 3, 27), eMajor.PHYSICS,
				"13 Landing Road", "(305)-334-0964", "lewis@aol.com", UUID.randomUUID());

		Student stud6 = new Student("Brandon", "Flugger", "Brown", newDate(1996, 7, 31), eMajor.NURSING,
				"53 Marsson Lane", "(355)-656-4054", "jugger@udel.edu", UUID.randomUUID());

		Student stud7 = new Student("Lee", "McWade", "Jones", newDate(1997, 4, 14), eMajor.PHYSICS, "63 Russell Square",
				"(253)-885-2330", "rusel@yahoo.com", UUID.randomUUID());

		Student stud8 = new Student("Marvin", "Ret", "Lawson", newDate(1995, 9, 8), eMajor.BUSINESS, "70 Luster Court",
				"(555)-252-6445", "rankin@aol.com", UUID.randomUUID());

		Student stud9 = new Student("William", "Bret", "Johnson", newDate(1995, 3, 31), eMajor.COMPSI,
				"25 Overlow Court", "(353)-226-4039", "setre@udel.edu", UUID.randomUUID());

		Student stud10 = new Student("David", "Randy", "Cartrell", newDate(1994, 11, 28), eMajor.CHEM, "76 Ranker Lane",
				"(205)-103-4405", "tommy@verizon.net", UUID.randomUUID());

		// Adds the Students to the ArrayList
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

		// List of each of the possible grades
		ArrayList<Integer> grPoint1 = new ArrayList<Integer>(Arrays.asList(95, 71, 32, 97, 79, 92, 67, 63, 85, 73));
		ArrayList<Integer> grPoint2 = new ArrayList<Integer>(Arrays.asList(95, 76, 43, 97, 60, 78, 85, 67, 83, 83));
		ArrayList<Integer> grPoint3 = new ArrayList<Integer>(Arrays.asList(96, 75, 65, 87, 74, 97, 73, 69, 80, 36));

		// Enrolls every student into the Sections
		for (int k = 0; k < students.size(); k++) {

			enroll1F.add(new Enrollment(sections.get(0).getSectionID(), students.get(k).getStudentID()));
			enroll1F.get(k).setGrade(grPoint1.get(k));

			enroll1S.add(new Enrollment(sections.get(1).getSectionID(), students.get(k).getStudentID()));
			enroll1S.get(k).setGrade(grPoint2.get(k));

			enroll2F.add(new Enrollment(sections.get(2).getSectionID(), students.get(k).getStudentID()));
			enroll2F.get(k).setGrade(grPoint3.get(k));

			enroll2S.add(new Enrollment(sections.get(3).getSectionID(), students.get(k).getStudentID()));
			enroll2S.get(k).setGrade(grPoint1.get(k));

			enroll3F.add(new Enrollment(sections.get(4).getSectionID(), students.get(k).getStudentID()));
			enroll3F.get(k).setGrade(grPoint2.get(k));

			enroll3S.add(new Enrollment(sections.get(5).getSectionID(), students.get(k).getStudentID()));
			enroll3S.get(k).setGrade(grPoint3.get(k));
		}

	}

	// Calculates the GPA of the Student
	public double calcStudentGPA(ArrayList<Enrollment> enroll1F, ArrayList<Enrollment> enroll1S,
			ArrayList<Enrollment> enroll2F, ArrayList<Enrollment> enroll2S, ArrayList<Enrollment> enroll3F,
			ArrayList<Enrollment> enroll3S, int Student) {

		double GPAAVG = 0;

		if ((enroll1F.get(Student).getGrade() + enroll1S.get(Student).getGrade() + enroll2F.get(Student).getGrade()
				+ enroll2S.get(Student).getGrade() + enroll3F.get(Student).getGrade()
				+ enroll3S.get(Student).getGrade()) / 6 >= 95) {
			GPAAVG = 4.0;
		} else if ((enroll1F.get(Student).getGrade() + enroll1S.get(Student).getGrade()
				+ enroll2F.get(Student).getGrade() + enroll2S.get(Student).getGrade() + enroll3F.get(Student).getGrade()
				+ enroll3S.get(Student).getGrade()) / 6 >= 90) {
			GPAAVG = 3.75;
		} else if ((enroll1F.get(Student).getGrade() + enroll1S.get(Student).getGrade()
				+ enroll2F.get(Student).getGrade() + enroll2S.get(Student).getGrade() + enroll3F.get(Student).getGrade()
				+ enroll3S.get(Student).getGrade()) / 6 >= 85) {
			GPAAVG = 3.50;
		} else if ((enroll1F.get(Student).getGrade() + enroll1S.get(Student).getGrade()
				+ enroll2F.get(Student).getGrade() + enroll2S.get(Student).getGrade() + enroll3F.get(Student).getGrade()
				+ enroll3S.get(Student).getGrade()) / 6 >= 80) {
			GPAAVG = 3.00;
		} else if ((enroll1F.get(Student).getGrade() + enroll1S.get(Student).getGrade()
				+ enroll2F.get(Student).getGrade() + enroll2S.get(Student).getGrade() + enroll3F.get(Student).getGrade()
				+ enroll3S.get(Student).getGrade()) / 6 >= 75) {
			GPAAVG = 2.50;
		} else if ((enroll1F.get(Student).getGrade() + enroll1S.get(Student).getGrade()
				+ enroll2F.get(Student).getGrade() + enroll2S.get(Student).getGrade() + enroll3F.get(Student).getGrade()
				+ enroll3S.get(Student).getGrade()) / 6 >= 70) {
			GPAAVG = 2.00;
		} else if ((enroll1F.get(Student).getGrade() + enroll1S.get(Student).getGrade()
				+ enroll2F.get(Student).getGrade() + enroll2S.get(Student).getGrade() + enroll3F.get(Student).getGrade()
				+ enroll3S.get(Student).getGrade()) / 6 >= 65) {
			GPAAVG = 1.50;
		} else if ((enroll1F.get(Student).getGrade() + enroll1S.get(Student).getGrade()
				+ enroll2F.get(Student).getGrade() + enroll2S.get(Student).getGrade() + enroll3F.get(Student).getGrade()
				+ enroll3S.get(Student).getGrade()) / 6 >= 60) {
			GPAAVG = 1.00;
		} else {
			GPAAVG = 0.00;
		}
		return GPAAVG;
	}

	@Test
	public void StudentGPATest() {
		assertEquals(4.0, calcStudentGPA(enroll1F, enroll1S, enroll2F, enroll2S, enroll3F, enroll3S, 0), .01);
		assertEquals(2.0, calcStudentGPA(enroll1F, enroll1S, enroll2F, enroll2S, enroll3F, enroll3S, 1), .01);
		assertEquals(0.0, calcStudentGPA(enroll1F, enroll1S, enroll2F, enroll2S, enroll3F, enroll3S, 2), .01);
		assertEquals(3.75, calcStudentGPA(enroll1F, enroll1S, enroll2F, enroll2S, enroll3F, enroll3S, 3), .01);
		assertEquals(2.0, calcStudentGPA(enroll1F, enroll1S, enroll2F, enroll2S, enroll3F, enroll3S, 4), .01);
		assertEquals(3.5, calcStudentGPA(enroll1F, enroll1S, enroll2F, enroll2S, enroll3F, enroll3S, 5), .01);
		assertEquals(2.5, calcStudentGPA(enroll1F, enroll1S, enroll2F, enroll2S, enroll3F, enroll3S, 6), .01);
		assertEquals(1.5, calcStudentGPA(enroll1F, enroll1S, enroll2F, enroll2S, enroll3F, enroll3S, 7), .01);
		assertEquals(3.0, calcStudentGPA(enroll1F, enroll1S, enroll2F, enroll2S, enroll3F, enroll3S, 8), .01);
		assertEquals(1.0, calcStudentGPA(enroll1F, enroll1S, enroll2F, enroll2S, enroll3F, enroll3S, 9), .01);
	}

	// Finds the GPA for each of the Students that are in the ArrayList
	@Test
	public void testMajorChangeStudent() {
		assertTrue(students.get(5).geteMajor() == eMajor.NURSING);
		students.get(5).seteMajor(eMajor.COMPSI);
		assertTrue(students.get(5).geteMajor() == eMajor.COMPSI);
	}

}
