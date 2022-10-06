package ex01;

public class Pessoa {
	
	private String nome, dataNascimento;
	private float altura;
	private int idade, ano;

	public void mostrarDados () {
			System.out.format("Nome: %s\nData nascimento: %s\nAltura: %.2f\n", nome, dataNascimento, altura);
			if (idade != 0) {
				System.out.println("Idade: " + idade);
			}		
	}
	
	public int calcularIdade() {
		ano = Integer.parseInt(dataNascimento.substring(dataNascimento.length() - 4));
		idade = 2022 - ano;
		return idade;
	}
	
//	 gets e sets
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
}
