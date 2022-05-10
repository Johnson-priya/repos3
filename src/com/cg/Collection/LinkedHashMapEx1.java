package com.cg.Collection;

import java.util.LinkedHashMap;

public class LinkedHashMapEx1 {

	public static void main(String[] args) {
		LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
		map.put("PNBE", "Delhi");
		map.put("PNBE", "Patna");
		map.put("SBC", "Banglore");
		map.put("MAS", "Chennai Central");
		System.out.println(map);
		String city=map.get("PNBE");
		System.out.println(city);
		

	}

}
