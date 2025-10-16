package diagrama;

import java.util.Scanner;

public class Ejercicio07 {

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

		// condición para saber que mensaje madar dependiendo de que número es mayor o si son iguales
		if (numero1 < numero2) {
			System.out.println(numero2 + " es mayor que " + numero1);
		} else {
			if (numero1==numero2) {
				System.out.println("Los dos números son iguales");
			}else {
				System.out.println(numero2 + "es menor que " + numero1);
			}
		
		}

		// cerrar scanner
		reader.close();
	}
}
