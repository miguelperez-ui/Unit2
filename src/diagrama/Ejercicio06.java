package diagrama;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// nuevo scanner
		Scanner reader = new Scanner(System.in);
		// variables para los dos números que se piden
		double numero1;
		double numero2;

		// Pregunta por dos números
		System.out.println("Introduce un número");
		numero1 = reader.nextDouble();
		System.out.println("Introduce otro número");
		numero2 = reader.nextDouble();

		// condición para saber que mensaje madar dependiendo de que número es mayor
		if (numero1 < numero2) {
			System.out.println(numero1 + "," + numero2);
		} else {
			System.out.println(numero2 + "," + numero1);
		}

		// cerrar scanner
		reader.close();
	}
}