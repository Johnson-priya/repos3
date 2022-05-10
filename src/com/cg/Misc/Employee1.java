package com.cg.Misc;

public class Employee1 {
	private int eid;
	private String fname;
	private String lname;
	private float sal;
	

	private char grade;
	

	public Employee1(int eid, String fname, String lname, float sal, char grade) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.lname = lname;
		this.sal = sal;
		this.grade = grade;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public float getSal() {
		return sal;
	}

	

	public void setSal(float sal) {
		this.sal = sal;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", fname=" + fname + ", lname=" + lname + ", sal=" + sal + ", grade=" + grade
				+ "]";
	}
	


	public static void main(String[] args) {
		
		Employee1 obj = new Employee1(45, "JOHNSON", "PRIYA", 30000, 'A');
		Employee1 obj2= new Employee1(34, "JOHN", "WAYNE", 45000, 'A');
		Employee1 obj3= new Employee1(23, "MONICA", "WILSON", 50000, 'A');
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj3);
		
		/*System.out.println("Employee Id: "+ obj.eid);
		 final Employee1 obj1 = new Employee1();
		 obj1.setFname("JOHNSON");
		 obj1.setLname("PRIYA");
		 obj1.setSal(30000);
		 obj1.setGrade('A');*/
		 
		

	}

}
