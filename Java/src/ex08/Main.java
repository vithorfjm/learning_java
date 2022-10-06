package ex08;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		System.out.println();
		emp.toString();
		System.out.println("Employee: " + emp);
		emp.toString();
		
		System.out.print("Which percentage to increase salary? ");
		emp.increaseSalary(sc.nextDouble());
		emp.netSalary();
		
		System.out.println("Updated data: " + emp);
	}

}
