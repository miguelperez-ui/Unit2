package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Nuevo scanner
		Scanner reader = new Scanner(System.in);

		// Variable de la suma de números
		int suma = 0;

		// Variable
		int contador = 1;

		// Variable del número que pedimos
		int numero;

		// Pide un número
		System.out.println("Introduzca un número:");
		numero = reader.nextInt();

		// Hace la suma mientras que el contador sea igual o menor que el numero
		do {
			suma += contador;
			contador++;
		} while (contador <= numero);

		// Imprimir suma
		System.out.println("La suma total es: " + suma);

		// Cerrar scanner
		reader.close();
	}

}
