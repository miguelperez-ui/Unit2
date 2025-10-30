package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		// Variable del numero que pedimos
		int numero = 0;

		// Variable de la cantidad de numeros positivos que introducimos
		int suma = 0;

		// Pedimos un número
		System.out.println("Dime un número");
		numero = reader.nextInt();

		// Mientras el número sea positivo
		while (numero >= 0) {
			// Suma un número a la cantidad de números intoducidos
			suma++;

			// Pide un número
			System.out.println("Dime un número");
			numero = reader.nextInt();
		}

		// Imprime la cantidad de números introducidos
		System.out.println("Has introducido: " + suma + " números.");

		// Cerrar scanner
		reader.close();
	}

}
