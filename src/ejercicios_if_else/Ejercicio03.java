package ejercicios_if_else;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		// variables de la ecuación
		int a;
		int b;
		int c;

		// variable de lo que está dentro de la raiz cuadrada en la ecuación
		int discriminante;

		// variables del resultado
		double x1;
		double x2;

		// pregunta por los valores
		System.out.println("Introuduzca el valor de a");
		a = reader.nextInt();
		System.out.println("Introuduzca el valor de b");
		b = reader.nextInt();
		System.out.println("Introuduzca el valor de c");
		c = reader.nextInt();

		// ecuación para determinar el discriminante
		discriminante = b * b - 4 * a * c;

		// condición para saber el resultado
		if (a == 0) {
			x1 = (double) -c / b;
			System.out.println("La ecuación solo tiene una solución: " + x1);
		} else {
			if (discriminante >= 0) {
				x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
				x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
				System.out.println("x1= " + x1);
				System.out.println("x2= " + x2);
			} else {
				System.out.println("La ecuación no tiene solución");
			}

		}
		// cerrar scanner
		reader.close();

	}

}
