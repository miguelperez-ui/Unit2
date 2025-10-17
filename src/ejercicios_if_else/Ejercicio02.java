package ejercicios_if_else;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// nuevo scanner
		Scanner reader = new Scanner(System.in);

		// variable del número que pide
		double numero;

		// pregunta por un número
		System.out.println("Introduce un número");
		numero = reader.nextDouble();

		// condición para determinar si el número es casi-cero o no
		if (-1 < numero && numero < 1 && numero != 0) {
			System.out.println("Es un número casi-cero");
		} else {
			System.out.println("No es un número casi-cero");
		}

		// cerrar scanner
		reader.close();

	}

}
