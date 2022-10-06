package ex02;


public class Main {
	public static void main(String[] args) {
		Elevador elevador1 = new Elevador();
		elevador1.inicializa(10, 12); // 5 pessoas / 3 andares
		elevador1.entra();
		elevador1.entra();
		elevador1.sobe();
		elevador1.entra();
		elevador1.sobe();
		elevador1.sai();
		elevador1.sai();
		elevador1.sai();
		elevador1.sai();
		elevador1.entra();
	}
}
