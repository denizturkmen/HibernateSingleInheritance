package com.denizturkmen.Entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Table")
@DiscriminatorValue(value = "StudentType")
public class Student extends Person{

	@Column(name = "School_Name",length = 50)
	private String schoolName;
	
	@Column(name = "Fee")
	private float fee;
	
	@Column(name="Section_Name")
	private String sectionName;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", fee=" + fee + ", sectionName=" + sectionName + "]";
	}
	
	
	
}
