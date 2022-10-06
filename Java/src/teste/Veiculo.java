package teste;

public class Veiculo {
	protected String placa;
	protected int ano;
	
	public Veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
	}
	
	public Veiculo() {
	}
	
	public void exibirDados() {
		System.out.println("Placa " + placa + "\tAno " + ano);
	}
}