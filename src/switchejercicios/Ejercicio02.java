package switchejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Abrir scanner
		Scanner reader = new Scanner(System.in);

		// Variable de un día en número
		int dia;

		// Pregunta por un número
		System.out.println("Dime un día de la semana en número");
		dia = reader.nextInt();

		// Condición para decir que día de la semana es
		switch (dia) {

		case 1 -> System.out.println("Lunes");
		case 2 -> System.out.println("Martes");
		case 3 -> System.out.println("Miércoles");
		case 4 -> System.out.println("Jueves");
		case 5 -> System.out.println("Viernes");
		case 6 -> System.out.println("Sábado");
		case 7 -> System.out.println("Domingo");
		default -> System.out.println("Tiene que ser un número entre 1 y 7");
		}

		// Cerrar scanner
		reader.close();

	}

}