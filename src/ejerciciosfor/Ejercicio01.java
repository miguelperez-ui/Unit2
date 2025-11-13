package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		
		//Variable del número que se pide
		int numero;
		
		//Pregunta por un número
		System.out.println("Introduce un número hasta el que quieras que cuente");
		numero= reader.nextInt();
		
		//Mientras que se llegue de 0 hasta el número que hemos puesto
		for (int contador=0;contador<=numero;contador++) {
			System.out.println(contador);
			
		}
		
		//Cerrar scanner
		reader.close();

	}

}
