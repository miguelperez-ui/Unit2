package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		// Variable de la cantidad de números
		int suma = 0;
		// Variable del número que pide
		int numero;

		// Pido un número
		System.out.println("Introduce un número:");
		numero = reader.nextInt();

		while (numero >= 0) {
			// Añadimos el valor de número a suma
			suma += numero;

			// Pido un número
			System.out.println("Introduce un número:");
			numero = reader.nextInt();
		} // Fin while

		System.out.println("La suma es: " + suma);

		reader.close();

	} // Fin main

}// Fin clase
