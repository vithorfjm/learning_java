package teste;

public class Onibus extends Veiculo {
	private int assentos;
	
	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}
	
	public Onibus() {
	}
	
	@Override
	public void exibirDados() {
		System.out.println("Placa " + placa + "\tAno " + ano + "\tAssentos " + assentos);
	}
}
