package ex09;

public class Student {
	
	public String nome;
	public double nota1, nota2, nota3;
	
	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}
	
	public void result (double finalGrade) {
		System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
		if (finalGrade < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60 - finalGrade);
		} else {			
			System.out.println("PASS");
		}
	}
	
}
