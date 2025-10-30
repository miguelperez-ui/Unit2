package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		
		double altura;
		double alturaMaxima;
		
		System.out.println("Introduce una altura");
		altura= reader.nextDouble();
		
		alturaMaxima= altura;
		
		while(altura != -1) {
			if (altura>alturaMaxima) {
				alturaMaxima=altura;
			}
			System.out.println("Introduce una altura:");
			altura= reader.nextDouble();
		}
		System.out.println("La altura máxima es: "+ alturaMaxima);

		reader.close();
	}

}
