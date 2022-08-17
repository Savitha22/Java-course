package com.StudentInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Rollno;
	@Column(length=20)
	private String Firstname;
	@Column(length=20)
	private String lastname;
	@Column
	private float marks;
	@Column(length=20)
	private String Subject;
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int Rollnos) {
		Rollno = Rollnos;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String ftname) {
		Firstname = ftname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String ltname) {
		lastname = ltname;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float mark) {
		marks = mark;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	
	
	
}
