package ex05;

public class Triangle {
	public double a, b, c, area;
	
	public void calcularArea() {
		double p = (a + b + c) / 2;
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
