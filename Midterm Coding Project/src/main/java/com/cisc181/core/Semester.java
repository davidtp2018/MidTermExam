package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {

	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public Semester(){
		SemesterID = UUID.randomUUID();
	}
	
	public Semester(Date StartDate, Date EndDate){
		this();
		this.StartDate = new java.util.Date();
		this.EndDate = new java.util.Date();
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semID) {
		this.SemesterID = semID;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date stDte) {
		this.StartDate = stDte;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date enDte) {
		this.EndDate = enDte;
	}
	
}
