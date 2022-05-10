package com.cg.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("PNBE", "Patna");
		map3.put("PNBE", "Delhi");
		map3.put("SBC", "Banglore");
		map3.put("MAS", "Chennai Central");
		System.out.println(map3);
		String city=map3.get("PNBE");
		System.out.println(city);
		boolean b = map3.containsKey("SBC");
		System.out.println(b);
		Set<String> keys= map3.keySet();
		System.out.println("......iterating key......");
		for(String k: keys) {
			System.out.println(k);
		}
		Collection<String> values = map3.values();
		System.out.println(".....iterating values......");
		for(String v: values) {
			System.out.println(v);
		}
		Set<Entry<String, String>> rows=map3.entrySet();
		System.out.println("....key value.....");
		for(Entry<String, String> row: rows) {
			String k=row.getKey();
			String v=row.getValue();
			System.out.println(k+ "   "+v);
		}
		
		

	}

}
