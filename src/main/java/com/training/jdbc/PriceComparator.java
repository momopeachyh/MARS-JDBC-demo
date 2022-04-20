package com.training.jdbc;
import java.util.Comparator;

public class PriceComparator implements Comparator<Product>{

	public int compare(Product o1, Product o2) {
	if(o1.price > o2.price) {
		return 1;
	} else if(o1.price < o2.price) {
		return -1;
	} else {
		return 0;
	}
	
	}
}
