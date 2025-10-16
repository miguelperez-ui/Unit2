package diagrama;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		// variables para los dos números que se piden
		double numero1;
		double numero2;

		// variable para la suma
		double suma;

		// variable para la resta
		double resta;

		// variable para la multiplicación
		double multi;

		// variable para la división
		double divi;

		// Pregunta por dos números
		System.out.println("Introduce un número");
		numero1 = reader.nextInt();
		System.out.println("Introduce otro número");
		numero2 = reader.nextInt();

		// ecuaciones con los dos números
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		multi = numero1 * numero2;
		divi = numero1 / numero2;

		/*
		 * Condición para saber si tenemos que imprimir el resultado que da la división
		 * o un mensaje diciendo que no se puede dividir entre cero
		 */
		if (numero2 != 0) {
			System.out.println("La suma da:" + suma);
			System.out.println("La resta da:" + resta);
			System.out.println("La multiplicación da:" + multi);
			System.out.println("La división da:" + divi);
		} else {
			System.out.println("La suma da:" + suma);
			System.out.println("La resta da:" + resta);
			System.out.println("La multiplicación da:" + multi);
			System.out.println("No se puede dividir entre cero");
		}

		// cerrar el scanner
		reader.close();
	}

}
