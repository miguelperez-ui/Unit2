package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		
		//Variable del número que se pide
		int numero;
		
		//Variable para contar cuántos múltiplos hay
		int multiplo = 0;
		
		//Pregunta por un número
		System.out.println("Introduce el número");
		numero=reader.nextInt();
		
		//Mientras que llegue de 0 al número que pedimos
		for(int contador=1;contador<=numero;contador++) {
			//Para encontrar múltiplos
			if (contador%3==0) {
				multiplo++;
			}
		}
		//Imprime cuantos múltiplos hay
		System.out.println("Hay "+ multiplo + " multiplos de 3");
		
		//Cerrar scanner
		reader.close();

	}

}
