package diagrama;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Creamos nuevo scanner
		Scanner reader = new Scanner(System.in);

		// variable del número que pedimos
		int numero;

		// Pregunta cuantos años tenemos
		System.out.println("¿Cuántos años tienes?");
		numero = reader.nextInt();

		/* Hacemos una condición. Si la variable número es 18 o mayor te sale un mensaje
		* diferente a si eres menor
		*/
		if (numero >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}

		// Cerrar scanner
		reader.close();
	}

}
