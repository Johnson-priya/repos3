package com.cg.Collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap<Student, Marksheet> map=new HashMap<>();
		map.put(new Student(101, "A", "X"), new Marksheet(90, 80, 77));
		map.put(new Student(102, "B", "IX"), new Marksheet(90, 80, 77));
		map.put(new Student(103, "C", "XI"), new Marksheet(90, 80, 77));
		map.put(new Student(104, "D", "XII"), new Marksheet(90, 80, 77));
		map.put(new Student(101, "A", "X"), new Marksheet(90, 80, 77));
		System.out.println("key...Value ");
		Set<Entry<Student, Marksheet>> row=map.entrySet();
		for(Entry<Student, Marksheet> r : row) {
			Student k =r.getKey();
			Marksheet v = r.getValue();
			System.out.println(k + "   "+v);
		}
		
		
		// TODO Auto-generated method stub

	}

}
