package com.cg.Collection;

import java.util.Objects;

public class Student {
	int rollNo;
	String studName;
	String courseName;
	

	@Override
	public int hashCode() {
		System.out.println(".....Hashcode called....");
		return rollNo;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("....equals called....");
		Student s = (Student) obj;
		if(s.rollNo==this.rollNo && s.studName.equals(this.studName) && s.courseName.equals(this.courseName)) 
			return true;
		else
			return false;
		
		
		
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studName=" + studName + ", courseName=" + courseName + "]";
	}

	public Student(int rollNo, String studName, String courseName) {
		super();
		this.rollNo = rollNo;
		this.studName = studName;
		this.courseName = courseName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public static void main(String[] args) {
		

	}

}
