package com.tnsif.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class javastreamexample {

	public static void main(String[] args) {
		
		List<Product> Productlist=new ArrayList<Product>();
		Productlist.add(new Product(1,"hp",25000f));
		Productlist.add(new Product(2,"lenova",45000f));
		Productlist.add(new Product(3,"apple",95000f));
		Productlist.add(new Product(4,"dell",75000f));
		
		List<Float> p1=Productlist.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
		System.out.println(p1);
		
		
		

	}

	

}
