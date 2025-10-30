package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		// Variable de lacuenta de números introducidos
		int contador = 0;

		// Variable de la suma de números positivos introducidos
		int sumaPositivos = 0;

		// Variable de la suma de números negativos introducidos
		int sumaNegativos = 0;

		// Variable de la cantidad de números negativos introducidos
		int contNegativos = 0;

		// Variable de la cantidad de ceros introducidos
		int contCeros = 0;

		// Variable de la media de los números negativos
		double mediaNeg;

		// Variable del número que pide el programa
		int numero;

		// Mientras contador sea menor que 10
		while (contador < 10) {
			// Pide un número
			System.out.println("Introduce un número");
			numero = reader.nextInt();

			// Si numero es mayor que 0
			if (numero > 0) {
				// Se suma el número con los positivos
				sumaPositivos += numero;
			} else {
				if (numero < 0) {
					// Se suma el número con los negativos
					sumaNegativos += numero;

					// Se suma 1 al contador de negativos
					contNegativos++;
				} else {
					// Se suma 1 al contador de ceros
					contCeros++;
				}
			}
			// Se suma 1 al contador de números
			contador++;
		}

		// Operación para sacar la media de números negativos
		mediaNeg = (double) sumaNegativos / (double) contNegativos;

		// Mensaje final
		System.out.println("La suma de números positivos es: " + sumaPositivos);
		System.out.println("La cantidad de ceros introducidos es: " + contCeros);
		System.out.println("La media de los números negativos es: " + mediaNeg);

		// Cerrar scanner
		reader.close();
	}

}
