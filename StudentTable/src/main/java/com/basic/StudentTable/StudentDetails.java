package com.basic.StudentTable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentDetails {
	private Integer rollno;
	private String firstname;
	private String lastname;

	public StudentDetails() {
	}

	public StudentDetails(Integer rollno, String firstname, String lastname) {
		this.rollno = rollno;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
