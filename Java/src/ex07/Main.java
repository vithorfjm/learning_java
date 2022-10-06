package ex07;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double area, perimeter, diagonal;
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.width =  sc.nextDouble();
		rectangle.height =  sc.nextDouble();
		area = rectangle.area();
		perimeter = rectangle.perimeter();
		diagonal = rectangle.diagonal();
		
		System.out.printf("AREA = " + area);
		System.out.printf("%nPERIMETER = " + perimeter);
		System.out.printf("%nDIAGONAL = " + diagonal);
	}

}
