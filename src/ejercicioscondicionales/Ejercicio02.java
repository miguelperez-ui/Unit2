package ejercicioscondicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		//Hay que realizar dos pruebas mínimo. Una poniendo un número menor que cero y otra con uno mayor
		
		// Crear scanner
		Scanner reader = new Scanner(System.in);

		// Variable del número que pide
		int numero;

		// Variable para saber si es positivo o negativo
		boolean esNegativo;

		// Pregunta por un número
		System.out.println("Introduce un número");
		numero = reader.nextInt();

		// Condición para saber si es negativo
		esNegativo = (numero < 0);

		/* 
		 * Mensaje condicionado por un ternario. Si es negativo se pasa a positivo. Si
		 *es positivo se deja igual
		 */
		System.out.println(esNegativo ? -numero : numero);

		// Cerrar scanner
		reader.close();

	}

}
