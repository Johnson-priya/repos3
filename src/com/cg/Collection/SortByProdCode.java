package com.cg.Collection;

import java.util.Comparator;

public class SortByProdCode implements Comparator<Product> {

	

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getProdCode()==p2.getProdCode())
		return 1;
		else
			return -1;
	}

}
