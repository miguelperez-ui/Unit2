package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		// Variable de la cantidad denúmeros introducida
		int cantNumero = 0;

		// Variable de la suma de todos los números
		int suma = 0;

		// Variable de la media de los números
		double media = 0;

		// Variable del número que introducimos
		int numero;

		// Pide un número
		System.out.println("Dime un número");
		numero = reader.nextInt();

		// Mientras que el número sea mayor que 0
		while (numero >= 0) {
			// Hace que se vayan sumando los números
			suma += numero;

			// Suma 1 a la cantidad de números
			cantNumero++;

			// Pide un número
			System.out.println("Dime un numero");
			numero = reader.nextInt();
		}

		// Calcula la media de los números introducidos
		media = (double) suma / (double) cantNumero;

		// Imprime la media
		System.out.println("La media es: " + media);

		// Cerrar scanner
		reader.close();

	}

}
