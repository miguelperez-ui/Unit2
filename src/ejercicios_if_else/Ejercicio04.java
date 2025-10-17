package ejercicios_if_else;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// nuevo scanner
		Scanner reader = new Scanner(System.in);

		// variable del número que pide
		int numero;

		// pregunta por un número
		System.out.println("Introduce un numero");
		numero = reader.nextInt();

		// condición para saber cuantas cifras tiene el número
		if (numero < 10 && numero >= 0) {
			System.out.println("El número es de una cifra");
		} else if (numero < 100 && numero >= 10) {
			System.out.println("El número tiene dos cifras");
		} else if (numero < 1000 && numero >= 100) {
			System.out.println("El número tiene tres cifras");
		} else if (numero < 10000 && numero >= 1000) {
			System.out.println("El número tiene cuatro cifras");
		} else if (numero <= 99999 && numero >= 10000) {
			System.out.println("El número tiene cinco cifras");
		} else {
			System.out.println("El número tiene que estar comprendido entre 0 y 99999");
		}

		// cerrar scanner
		reader.close();

	}

}
