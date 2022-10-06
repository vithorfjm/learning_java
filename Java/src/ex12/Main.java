package ex12;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		double avg = 0;
		for (int i=0; i<n; i++) {
			avg += vect[i].getPrice();
		}
		avg /= n;
		System.out.printf("AVERAGE PRICE = %.2f", avg);
		sc.close();
	}

}
