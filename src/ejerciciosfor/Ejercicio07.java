package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		//Variabkle del número que se pide
		int numero;

		//Pregunta por un número
		System.out.println("Dame un número positivo");
		numero = reader.nextInt();

		//Variable para saber si es primo el número
		boolean esPrimo = true;

		
		for (int contador = 2; contador <= numero / 2; contador++) {
			if (numero <= 1) {
				System.out.println("El número no es primo");
			} else {
				for (int contador1 = 2; contador1 <= numero; contador1++) {
					if (numero % contador1 == 0) {
						esPrimo = false;
					}
				}
			}
		}
		//Si es primo
		if (esPrimo) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}

		//Cerrar scanner
		reader.close();

	}

}
