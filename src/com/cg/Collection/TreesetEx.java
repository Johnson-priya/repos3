package com.cg.Collection;

import java.util.TreeSet;

public class TreesetEx {

	public static void main(String[] args) {
		Student1 s1=new Student1(45, "Johnson", "X");
		Student1 s2=new Student1(34, "PRIYA", "XII");
		Student1 s3=new Student1(32, "John", "IX");
		Student1 s4=new Student1(54, "Shalu", "IX");
		Student1 s5=new Student1(56, "Priya", "X");
		TreeSet<Student1> values = new TreeSet<Student1>(new CompareByName());
		values.add(s1);
		values.add(s2);
		values.add(s3);
		values.add(s4);
		values.add(s5);
		
		for(Student1 s: values)
		System.out.println(s);
		

	}

}
