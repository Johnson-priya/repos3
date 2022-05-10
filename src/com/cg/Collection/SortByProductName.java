package com.cg.Collection;

import java.util.Comparator;

public class SortByProductName implements Comparator<Product> {

	

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getProdName().compareTo(p2.getProdName())>=1)
			return 1;
		else
			return -1;
	}

}
