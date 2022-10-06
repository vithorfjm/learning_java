package ex09;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double finalGrade;
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Student student = new Student();
		student.nome = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		finalGrade = student.finalGrade();
		student.result(finalGrade);
	}

}
