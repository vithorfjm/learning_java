package ex10;

public class ContaBancaria {
	private double saldo;
	private String nome; 
	private int numConta;
	
	// Construtor
	public ContaBancaria (String nome, int numConta, double depositoInicial) {
		this.nome = nome;
		this.numConta = numConta;
		deposito(depositoInicial);
	}
	
	public ContaBancaria (String nome, int numConta) {
		this.nome = nome;
		this.numConta = numConta;
		this.saldo = 0;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nomeTitular) {
		this.nome = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumConta() {
		return numConta;
	}
	
	// Methods
	
	public void deposito (double valor) {
		saldo += valor;
	}
	
	public void saque (double valor) {
		saldo -= valor + 5.0;
	}
	
	@Override
	public String toString() {
		return String.format("Num. conta: %d, Titular: %s, Saldo: R$%.2f", numConta, nome, saldo);
	}
}
