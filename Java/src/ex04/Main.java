package ex04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qntMinutos = sc.nextInt();
		double valorAPagar = 50.0, valorExtra = 0;
		
		
//		if (qntMinutos > 100) {
//			valorExtra = qntMinutos = (qntMinutos - 100) * 2;
//			valorAPagar += valorExtra;
//		}

		valorAPagar = qntMinutos > 100 ? ((qntMinutos - 100) * 2) + 50 : valorAPagar;
		
		System.out.printf("Valor a pagar: R$%.2f", valorAPagar);
		
		
	}

}
