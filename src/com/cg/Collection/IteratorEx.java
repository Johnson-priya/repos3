package com.cg.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorEx {

	public static void main(String[] args) {
		ArrayList<Integer> value= new ArrayList<Integer>();
		value.add(34);
		value.add(89);
		value.add(87);
		value.add(8);
		Iterator<Integer> it= value.iterator();
		System.out.println(".....iterate using for each loop....");
		for(int a:value){
			System.out.println(a);
		}
		System.out.println(".....iterating using iterator.....");
		while(it.hasNext()) {
			int val=it.next();
			System.out.println(val);
		}
		System.out.println("....Iterating in reverse.....");
		ListIterator<Integer> it2=value.listIterator(value.size());
		while(it2.hasPrevious()) {
			int val=it2.previous();
			System.out.println(val);
		}
		System.out.println(".....Access elements and replace elements using set and get method......");
		System.out.println("Accessd elements"+ value.get(1));
		value.set(1, 123);
		for(Integer r: value) {
			System.out.println(r);
		}
		System.out.println("......Sorting list.....");
		Collections.sort(value);//static method in Collection class.
		System.out.println(value);
		//Collections.reverse(value);
		//System.out.println(value);

	}

}
