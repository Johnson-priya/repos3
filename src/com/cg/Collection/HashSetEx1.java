package com.cg.Collection;

import java.util.HashSet;

public class HashSetEx1 {

	public static void main(String[] args) {
		Employee e1=new Employee(102, 'A', "Mumbai");
		Employee e2=new Employee(106, 'B', "Banglore");
		Employee e3=new Employee(103, 'A', "Pune");
		Employee e4=new Employee(102, 'c', "Mumbai");
		Employee e5=new Employee(105, 'B', "Delhi");
		HashSet<Employee> values=new HashSet<Employee>();
		values.add(e1);
		values.add(e2);
		values.add(e3);
		values.add(e4);
		values.add(e5);
		System.out.println("no of elements"+ values.size());
		System.out.println(values);
		
	
		/*for(Employee e:values) {
			System.out.println(e);*/
		//}

	}

}
