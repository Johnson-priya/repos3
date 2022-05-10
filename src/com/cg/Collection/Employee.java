package com.cg.Collection;

public class Employee {
	private int id;
	private char grade;
	private String location;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", grade=" + grade + ", location=" + location + "]";
	}

	public Employee(int id, char grade, String location) {
		super();
		this.id = id;
		this.grade = grade;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

	}

}
