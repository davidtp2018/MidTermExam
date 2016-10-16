//Thomas Pennington
package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course(){
		CourseID = UUID.randomUUID();
	}
	
	public Course(String CourseName, int GradePoints, eMajor Major){
		this();
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
		this.Major = Major;
	}
	
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID crsID) {
		this.CourseID = crsID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String crsName) {
		this.CourseName = crsName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int GrPts) {
		this.GradePoints = GrPts;
	}
	
	public eMajor geteMajor(){
		return Major;
	}
	
	public void seteMajor(eMajor Major){
		this.Major = Major;
	}
	
}
