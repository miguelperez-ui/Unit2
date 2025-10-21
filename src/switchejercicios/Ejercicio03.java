package switchejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner reader = new Scanner(System.in);

		// Variables de los números que pide el programa
		double numero1;
		double numero2;

		// Variables de las operaciones a elegir
		double suma;
		double resta;
		double multi;
		double divi;

		// Variable de la elección que te propone el programa
		String eleccion;

		// Pregunta por un número
		System.out.println("Dime un número");
		numero1 = reader.nextInt();

		// Pregunta por otro número
		System.out.println("Dime otro número");
		numero2 = reader.nextInt();

		// Pregunta por una letra entre cuatro posibles
		System.out.println("Opciones: ");
		System.out.println("A. SUMA");
		System.out.println("B. RESTA ");
		System.out.println("C. MULTIPLICACIÓN");
		System.out.println("D. DIVISIÓN");
		System.out.println("");
		System.out.println("Elige una letra:");
		eleccion = reader.next();

		// Condición para saber que ecuación hacer dependiendo de la letra que hayas
		// elegido
		switch (eleccion) {
		case "A" -> {
			suma = numero1 + numero2;
			System.out.println(suma);
		}
		case "B" -> {
			resta = numero1 - numero2;
			System.out.println(resta);
		}
		case "C" -> {
			multi = numero1 * numero2;
			System.out.println(multi);
		}
		case "D" -> {
			if (numero2 == 0) {// Condición para saber si se puede dividir o no
				System.out.println("No se puede dividir entre cero");
			} else {
				divi = numero1 / numero2;
				System.out.println(divi);
			}
		}
		default -> {
			System.out.println("Opción incorrecta");

		}
		}

		// Cerrar scanner
		reader.close();

	}

}
