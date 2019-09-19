package com.day21;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Product> pd = new ArrayList<Product>(3);
		
		pd.add(new Product(1, "가 상품", 1000));
		Product p1 = new Product(2, "나 상품", 2000);
		pd.add(p1);
		pd.add(new Product(3, "다 상품", 3000));
		
		for(Product n : pd) {
			System.out.println(n.toString());
		}

	}

}
