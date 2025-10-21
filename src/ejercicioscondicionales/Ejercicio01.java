package ejercicioscondicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		/*Hay que realizar como mínimo 8 pruebas. En primer lugar hay que hacer dos pruebas para
		 * ver si fuciona el rango de número. En segundo lugar hay que ir probando a poner numeros
		 * capiúas y no capicúas de diferentes cifras.
		 * Si es capicúa deberá de salir el mensaje "Es un número capicúa", por el contrario, si
		 * no lo es saldrá "No es un número capicúa" por pantalla.
		 */
		
		
		// Crear scanner
		Scanner reader = new Scanner(System.in);

		// Variable del número que pide el programa
		int numero;

		// Variable del resto que se obtiene de ese número dividido por 10 elevado a su
		// número de cifras
		int resto;

		// Variable del segundo dígito de un número de cuatro cifras
		int numero2;

		// Variable del tercer dígito de un número de cuatro cifras
		int resto2;

		// Pide un número
		System.out.println("Introduce un número entre 0 y 9999");
		numero = reader.nextInt();

		// Condición para saber si es un número capicúa
		if (numero < 0 || numero > 9999) {
			System.out.println("Error, tiene que ser u número entre 0 y 9999");
		} else {
			if (numero < 10) {// Número de una cifra
				System.out.println("Es un número capicúa");
			} else {
				if (numero < 100) {// Número de dos cifras
					resto = numero % 10;
					numero = numero / 10;
					if (resto == numero) {
						System.out.println("Es un número capicúa");
					} else {
						System.out.println("No es un número capicúa");
					}
				} else {
					if (numero < 1000) {// Número de tres cifras
						resto = numero % 100;
						numero = numero / 100;
						if (resto == numero) {
							System.out.println("Es un número capicúa");
						} else {
							System.out.println("No es número capicúa");
						}
					} else {
						if (numero < 10000) {// Número de cuatro cifras
							resto = numero % 1000;
							numero = numero / 1000;
							numero2 = (numero / 100) % 10;
							resto2 = (numero / 10) % 100;
							if (resto == numero && numero2 == resto2) {
								System.out.println("Es un número capicúa");
							} else {
								System.out.println("No es un número capicúa");
							}
						}
					}
				}
			}
		}

		// Cerrar scanner
		reader.close();

	}

}
