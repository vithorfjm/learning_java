package teste;

public class Caminhao extends Veiculo {
	private int eixos;
	
	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;
	}
	
	public Caminhao() {
	};
	
	public void exibirDados() {
		System.out.println("Placa " + placa + "\tAno " + ano + "\tEixos " + eixos);
	}
}
