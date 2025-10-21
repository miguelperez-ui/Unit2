package switchejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Nuevo scanner
		Scanner reader = new Scanner(System.in);

		// Variables de las dos primeras tiradas
		String tirada1;
		String tirada2;

		// Variables de tiradas convertidas a números
		int numero1;
		int numero2;

		// variable de la suma
		int suma;

		// Pregunta por un número
		System.out.println("Has tirado un dado de seis caras, ¿qué ha salido?");
		tirada1 = reader.next();

		// Condición para pasar de string a número entero
		numero1 = switch (tirada1) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> {
			System.out.println("Número incorrecto");
			yield -1;
		}
		};

		// Pregunta por un número
		System.out.println("Has tirado otro dado de seis caras, ¿qué ha salido?");
		tirada2 = reader.next();

		// Condición para pasar de string a número entero
		numero2 = switch (tirada2) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> {
			System.out.println("Número incorrecto");
			yield -1;
		}
		};

		// condición para saber si se pueden sumar las puntuaciones o se han introducido
		// valores incorrectos
		if (numero1 > 6 || numero1 < 1 || numero2 > 6 || numero2 < 1) {
			System.out.println("Has usado números que no son correctos, no te puedo mostrar la suma");
		} else {
			suma = numero1 + numero2;
			System.out.println("La suma de tu puntuación es de " + suma);
		}

		// Cerrar scanner
		reader.close();

	}

}
