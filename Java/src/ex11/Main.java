package ex11;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in)	;
		
		double avg = 0;
		int n = sc.nextInt();
		double[] vect = new double[n];
		for (int i = 0; i<n; i++) {
			vect[i] = sc.nextDouble();
			avg += vect[i];
		}
		
		avg /= n;
		System.out.printf("AVERAGE HEIGHT = %.2f", avg);
		sc.close();
	}

}
