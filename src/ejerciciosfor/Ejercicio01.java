package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un número hasta el que quieras que cuente");
		numero= reader.nextInt();
		
		for (int contador=0;contador<=numero;contador++) {
			System.out.println(contador);
			
		}
		
		
		reader.close();

	}

}
