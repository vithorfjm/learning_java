package ex01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
//		Pessoa pessoa1 = new Pessoa();
//		pessoa1.setNome("Joao");
//		pessoa1.setDataNascimento("10/10/2000");
//		pessoa1.setAltura(1.72f);
//		pessoa1.calcularIdade();
//		pessoa1.mostrarDados();
//		float x = sc.nextFloat();
//		System.out.println(x);
		
		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
