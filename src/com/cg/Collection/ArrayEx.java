package com.cg.Collection;
import java.util.*;

public class ArrayEx {

	public static void main(String[] args) {
		ArrayList<String> values= new ArrayList<>();
		values.add("5");
		values.add("8");
		values.add("9");
		values.add("12");
		for(String i : values) {
			System.out.println(i);
		// TODO Auto-generated method stub

	}
		ArrayList<String> values1 = new ArrayList<String>();
		values1.add("Priya");
		values1.add("Johnson");
		values1.add("Bindu");
		values1.add("Rohit");
		for(String s: values1){
			System.out.println(s);
		}
		System.out.println(values.addAll(values1));
		System.out.println(values);
		System.out.println("...........");
		String name = values1.get(0);
		System.out.println(name);
		Collections.sort(values1);
		System.out.println("......After Sorting....");
		System.out.println(values1);
		System.out.println(".......Removing all elements..........");
		values1.clear();
		System.out.println(values1);

}
}
