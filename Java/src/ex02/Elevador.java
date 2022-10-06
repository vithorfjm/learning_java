package ex02;

public class Elevador {
	private int andarAtual, totalAndar, capacidadeElevador, qntPessoas;
	
	public void inicializa (int capacidadeElevador, int totalAndar) {
		this.capacidadeElevador = capacidadeElevador;
		this.totalAndar = totalAndar;
		this.andarAtual = 0;
		this.qntPessoas = 0;
		System.out.println("ELEVADOR INICIADO");
	}
	
	public void entra () {
		if (qntPessoas == capacidadeElevador) {
			System.out.println("Elevador cheio! Nao foi possivel entrar");
		} else {			
			qntPessoas++;
		}
		mostrarAndarPessoas();
	}
	
	public void sai () {
		if (qntPessoas > 0) {
			qntPessoas--;
		} else {
			System.out.println("O elevador ja esta vazio");
		}
		mostrarAndarPessoas();
	}
	
	public void sobe() {
		if (andarAtual == totalAndar) {
			System.out.println("Elevador ja esta no andar mais alto");
		} else {
			andarAtual++;
		}
		mostrarAndarPessoas();
	}
		
	public void desce() {
		if (andarAtual == 0) {
			System.out.println("Elevador ja esta no terreo");
		} else {
			andarAtual--;
		}
		mostrarAndarPessoas();
	}
	
	private void mostrarAndarPessoas () {
		System.out.println("==========================");
		System.out.format("Andar atual \t\t%d\nQuantidade de pessoas \t%d", andarAtual, qntPessoas);
		System.out.println("\n==========================");;
	}
}
