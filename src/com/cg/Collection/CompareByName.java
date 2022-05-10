package com.cg.Collection;

import java.util.Comparator;

public class CompareByName implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		int r=s1.getStudName().compareTo(s2.getStudName());
				return r;
	// TODO Auto-generated method stub
		
	}

}
