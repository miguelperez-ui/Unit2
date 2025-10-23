package ejercicioscondicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Nuevo scanner
		Scanner reader = new Scanner(System.in);

		// Creamos una variable aletoria
		Random aleatorio = new Random();

		// Variable de número aleatorio
		int num1 = aleatorio.nextInt(1, 100);

		// Variable de número aleatorio
		int num2 = aleatorio.nextInt(1, 100);

		// Variable de la suma de los números anteriores
		int suma = num1 + num2;

		// Variable del número que ponemos nosotros
		int sumaUsuario;

		// Imprime los dos números aleatorios
		System.out.println("Número 1: " + num1);
		System.out.println("Número 2: " + num2);

		// Pregunta por la suma de los dos números anteriores
		System.out.println("¿Cuánto es la suma de " + num1 + " y " + num2 + "?");
		sumaUsuario = reader.nextInt();

		// Condición para para saber si el usuario ha acertado
		if (sumaUsuario == suma) {
			System.out.println("¡CORRECTO!");
		} else {
			System.out.println("¡INCORRECTO!, la suma es " + suma);
		}

		// Cerrar scanner
		reader.close();

	}

}
