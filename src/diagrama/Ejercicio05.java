package diagrama;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Creamos nuevo scanner
		Scanner reader = new Scanner(System.in);

		// variable del número que pedimos
		int numero;

		// Pregunta un número
		System.out.println("Dime un número");
		numero = reader.nextInt();

		/*
		 * Hacemos una condición. Si la variable número es 0 o mayor te sale un mensaje
		 * diferente a si eres menor
		 */
		if (numero >= 0) {
			System.out.println("El número es positivo");
		} else {
			System.out.println("El número es negativo");
		}

		// Cerrar scanner
		reader.close();
	}

}
