package ex06;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Product product = new Product();
		
		System.out.println("Enter product data");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		System.out.println();
		product.toString();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		System.out.println();
		
		System.out.println("Uptdated data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());
		System.out.println();
		System.out.println("Uptdated data: " + product);
		
	}

}
