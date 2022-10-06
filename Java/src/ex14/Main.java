package ex14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)	;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		for (int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("VALORES = ");
		
		double soma = 0;
		for (int i = 0; i<n; i++) {
			System.out.print(vect[i] + "    ");
			soma += vect[i];
		}
		System.out.println();
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + soma/n);
		
		sc.close();
	
	}

}
