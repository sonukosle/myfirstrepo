package com.main.model;

import java.util.List;
import java.util.Scanner;

import com.main.Vending;

public class Items {

	Vending vending = new Vending();

	public boolean isProductAvil(String productName) {

		boolean result = false;

		List<Products> products = Vending.getProducts();
		for (Products p : products) {
			if (!p.getpName().equals(productName)) {
				return true;
			}

		}

		return result;
	}

	public void issueProduct(List<Products> t) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Product Name :");
//		String pname = sc.nextLine();
//		System.out.println("Entere the Quantity");
//		int pQuant = sc.nextInt();
//		System.out.println("===============================");
//		String pName = p.getpName();
//		long pPrice = p.getpPrice();
//		long pQuantity = p.getpQuantity();
//		System.out.println(pName);
//		if (pname == pName) {
//
//		} else if (pQuant > pQuantity) {
//
//			System.out.println("No more product Available !!");
//
//		} else if (pQuant <= pQuantity) {
//
////			long total = pQuantity - pQuant;
//			long uTotalproductPrice = pQuant * pPrice;
//			System.out.println("Your item is : " + pname);
//			System.out.println("Your Quantity is : " + pQuant);
//			System.out.println("Your Total Amount is : " + uTotalproductPrice);
//			System.out.println("thanks for visiting here..HAVE A NICE DAY..");
//
//		} else {
//			System.out.println("Something went wrong..Please try again");
//		}

//		Vending vending = new Vending();

		// =============================================================
		boolean flag = true;
		while (flag) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the product name :");
			String productName = sc.nextLine();
			if (new Items().isProductAvil(productName)) {
				System.out.println("Not Available this type of Product : " + productName);
				return;
			}

			System.out.println("Enter the product Quantitty");
			int productQyantity = sc.nextInt();
			System.out.println("Enter the product Price");
			int productPrice = sc.nextInt();

			List<Products> products = Vending.getProducts();
			for (Products p : products) {
					if (p.getpName().equals(productName)) {

						System.out.println("Product : " + p.getpName());

						if (productQyantity > p.getpQuantity()) {

							System.out.println("Product is insufficient !!");
							break;
						}
						if (productPrice > p.getpPrice()) {
							System.out.println("Invalid Amount !!");
							break;
						}
						if (productPrice < p.getpPrice()) {
							System.out.println(p.getpPrice());
							System.out.println(productPrice);
							System.out.println("Insufficient amount !!");
							break;
						}

						if (productQyantity <= p.getpQuantity()) {

							System.out.println("====================Welcome=======================");

							long userProductQuantity = p.getpQuantity();

							long totalQuantity = userProductQuantity - productQyantity;
							long getpPrice = p.getpPrice();
							long totalamount = productQyantity * getpPrice;
							System.out.println("Product Name : " + p.getpName());
							System.out.println("Product Price : " + p.getpPrice());
							System.out.println("Product Quantity : " + productQyantity);
							System.out.println("-------------------------------------------");
							System.out.println("Total amount to be paid : " + totalamount + ".00/");
							System.out.println("-------------------------------------------");
							System.out.println("Remaining Products Available : " + totalQuantity);
							System.out.println("--------------------------------------------");
							System.out.println("============Thanks to visiting my Store================");
							System.out.println("======================Have a noce day==================");

						} else {
							System.out.println("somthingwent wrong");
							break;
						}

					}
				

			}
			sc.nextLine();
			System.out.println("Want to continue shopping Y/N");
			String uInput = sc.nextLine();
			if (uInput.equalsIgnoreCase("n")) {

				flag = false;
				System.out.println("Thanks for the shopping..");
			}

		}
	}
}
