package com.cg.Collection;

public class Student1 implements Comparable<Student1> {
	private int rollNo;
	private String studName;
	private String courseName;
	

	public Student1(int rollNo, String studName, String courseName) {
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
		// TODO Auto-generated method stub

	}


	@Override
	public String toString() {
		return "Student1 [rollNo=" + rollNo + ", studName=" + studName + ", courseName=" + courseName + "]";
	}


	@Override
	public int compareTo(Student1 s) {
		if(this.rollNo>s.rollNo)
			return 1;
		else if(this.rollNo<s.rollNo)
			return -1;
		else
			return 0;
	}

}
