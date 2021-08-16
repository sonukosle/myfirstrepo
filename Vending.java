package com.main;

import java.util.ArrayList;
import java.util.List;

import com.main.model.Items;
import com.main.model.Products;

public class Vending {

	public static void main(String[] args) {

//		Products product = new Products();
//		product.setpName("Thumsup");
//		product.setpPrice(15);
//		product.setpQuantity(50);
//
//		System.out.println("Product name :" + product.getpName());
//		System.out.println("Product price :" + product.getpPrice());
//		System.out.println("Product quantity :" + product.getpQuantity());
		
		List<Products> products = getProducts();
		for (Products p : products) {
//			System.out.printn("===================================");
			System.out.println("Product Name : "+p.getpName());
//			System.out.println("===================================");
			System.out.println("Product Price : "+p.getpPrice()+".00/");
//			System.out.print("===================================");
			System.out.println("Product Quantity : "+p.getpQuantity());
			System.out.println("================================");
		}

//		System.out.println("=================================");
		System.out.println("=========Welcome to A-Z Shop=======");
		System.out.println("=================================");

//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the product Name :");
//		String pname = sc.nextLine();
//		System.out.println("product name is : "+pname);
//		System.out.println("Enter the Quantity :");
//		int q = sc.nextInt();
//		System.out.println("Product Quantity is :"+q);
//		System.out.println("===========================================");
//		
//		System.out.println("Your total amount is :");

		Items it = new Items();
		it.issueProduct(products);

	}

	public  static List<Products> getProducts() {
		List<Products> list = new ArrayList<Products>();

		list.add(new Products("pepsi", 25, 12));
		list.add(new Products("sprite", 40, 15));
		list.add(new Products("mirinda", 100, 10));
		list.add(new Products("limka", 100, 15));

		return list;

	}

}
