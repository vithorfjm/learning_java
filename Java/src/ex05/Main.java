package ex05;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Triangle x = new Triangle(), y = new Triangle();
		
		System.out.println("Medidas triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		x.calcularArea();
		System.out.println("Medidas triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		y.calcularArea();	
		
		sc.close();
		
		System.out.printf("Area triangulo X: %.4f%n", x.area);
		System.out.printf("Area triangulo Y: %.4f%n", y.area);
		
		if (y.area > x.area) {
			System.out.println("Maior area: Y");
		} else {
			System.out.println("Maior area: X");
		}
	}
	
}
