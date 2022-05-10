package com.cg.Collection;

import java.util.ArrayList;

public class ArrayListUserDefined {

	public static void main(String[] args) {
		Student2 s1= new Student2(12, "Priya", 22);
		Student2 s2=new Student2(23, "Johnson", 22);
		Student2 s3=new Student2(24, "XYZ", 23);
		Student2 s4=new Student2(45, "ABC", 20);
		ArrayList<Student2> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println(al);
		//for(Student2 s: al) {
			//System.out.println(al);
		//}
		//System.out.println(al.get(0));
		//System.out.println(al.set(0, s2));
		//for(Student2 s: al) {
			//System.out.println(s);
		//}
		
		// TODO Auto-generated method stub

	}

	
	

}
