package com.cg.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortingCollectionEx {
	public static void main(String args[]) {
		Product p1= new Product(111, "Teddy Bear", 500, 4.5f);
		Product p2= new Product(114, "Mobile", 50000, 4.7f);
		Product p3= new Product(118, "Laptop", 50000, 4.3f);
		Product p4= new Product(110, "Watch", 5000, 4.1f);
		Product p5= new Product(113, "Shoes",900, 4.6f);
		ArrayList<Product> prodList=new ArrayList<Product>();
		prodList.add(p1);
		prodList.add(p2);
		prodList.add(p3);
		prodList.add(p4);
		prodList.add(p5);
		for(Product p: prodList) {
			System.out.println(p);
		}
		Collections.sort(prodList);
		System.out.println("....Sorted by price....");
		for(Product p: prodList) {
		System.out.println(p);
		}
		Collections.sort(prodList, new SortingByRating());
		System.out.println("....Sorted by Ratings.... ");
		for(Product p: prodList) {
		System.out.println(p);
		}
		 Collections.sort(prodList, new SortByProductName());
		 System.out.println("....Sorted by Product name.... ");
			for(Product p: prodList) {
			System.out.println(p);
			}
			Collections.sort(prodList, new SortByProdCode());
			System.out.println("....Sorted by Product code.... ");
			for(Product p: prodList) {
			System.out.println(p);
			}
			
		 
		
			
		
		
		
	}
	

}
