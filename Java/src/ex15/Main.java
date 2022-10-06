package ex15;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];
		
		for (int i = 0; i<n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoa(nome, idade, altura);
		}
		
		double avg = 0, qntd = 0;
		
		for (int i = 0; i<n; i++) {
			avg += vect[i].getAltura();
			if (vect[i].getIdade() < 16) {
				qntd++;
			}
		}
		avg /= n;
		
		System.out.printf("Altura media: %.2f%n", avg);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", ((qntd*100) / n));
		for (int i = 0; i<n; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
		
		sc.close();
	}

}
