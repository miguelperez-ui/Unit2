package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		
		int numero;
		int multiplo = 0;
		
		System.out.println("Introduce el número");
		numero=reader.nextInt();
		
		for(int contador=1;contador<=numero;contador++) {
			if (contador%3==0) {
				multiplo++;
			}
		}
		
		System.out.println("Hay "+ multiplo + " multiplos de 3");
		
		reader.close();

	}

}
