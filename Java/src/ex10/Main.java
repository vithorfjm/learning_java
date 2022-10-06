package ex10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ContaBancaria conta;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Nome titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Deposito inicial (s/n) ?");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Deposito inicial: R$");
			double depositoInicial = sc.nextDouble();
			conta = new ContaBancaria(nome, numConta, depositoInicial);
		} else {			
			conta = new ContaBancaria(nome, numConta);
		}
		conta.toString();
		System.out.println(conta);
		
		System.out.print("Valor de depósito: R$");
		conta.deposito(sc.nextDouble());
		System.out.println(conta);
		
		System.out.println();
		
		System.out.print("Valor de saque: R$");
		conta.saque(sc.nextDouble());
		System.out.println(conta);
	}

}
