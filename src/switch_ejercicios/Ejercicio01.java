package switch_ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Nuevo scanner
		Scanner reader = new Scanner(System.in);

		// Variable de la nota
		int nota;

		// Pregunta por un número
		System.out.println("Dime una nota entera");
		nota = reader.nextInt();

		// Condición para decir un mensaje dependiendo de la nota previa
		switch (nota) {

		case 0, 1, 2, 3, 4 -> System.out.println("Insuficiente");
		case 5 -> System.out.println("Suficiente");
		case 6 -> System.out.println("Bien");
		case 7, 8 -> System.out.println("Notable");
		case 9, 10 -> System.out.println("Sobresaliente");
		default -> System.out.println("Tiene que ser una nota entre 1 y 10");
		}

		// Cerrar scanner
		reader.close();

	}

}
