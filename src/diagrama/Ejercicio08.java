package diagrama;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// nuevo scanner
		Scanner reader = new Scanner(System.in);

		// variables para los dos números que se piden
		double numero1;
		double numero2;
		double numero3;

		// Pregunta por dos números
		System.out.println("Introduce un número");
		numero1 = reader.nextDouble();
		System.out.println("Introduce otro número");
		numero2 = reader.nextDouble();
		System.out.println("Introduce otro número más");
		numero3 = reader.nextDouble();

		/*
		 * condición para saber que mensaje mandar dependiendo de que números son
		 * mayores o menores entre ellos
		 */
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println(numero1 + " es mayor que los otros números");
		} else {
			if (numero2 > numero1 && numero2 > numero3) {
				System.out.println(numero2 + " es mayor que los otros números");
			} else {
				System.out.println(numero3 + " es mayor que los otros números");
			}
		}
		// cerrar scanner
		reader.close();
	}
}
