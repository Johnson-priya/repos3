package com.cg.Collection;

public class Student2 {

	int rollno;  
	  String name;  
	  int age;  
	  Student2(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }
	@Override
	public String toString() {
		return "Student2 [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}  
}
