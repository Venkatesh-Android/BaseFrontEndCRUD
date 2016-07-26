package com.niit.BaseFrontEndCRUD.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) // for Autonumber
	private int studentId;
	@Column
	private String firstname;
	@Column
	private String lasstname;
	@Column
	private int  yearLevel;
	public Student() { }
	public Student(int studentId, String firstname, String lasstname, int yearLevel) {
		super();
		this.studentId = studentId;
		this.firstname = firstname;
		this.lasstname = lasstname;
		this.yearLevel = yearLevel;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLasstname() {
		return lasstname;
	}
	public void setLasstname(String lasstname) {
		this.lasstname = lasstname;
	}
	public int getYearLevel() {
		return yearLevel;
	}
	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	
	
}
