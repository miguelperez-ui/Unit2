package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio05 {

public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner reader = new Scanner(System.in);
		
		//Declaramos una variable para el número
		int numero;
		
		//Pedimos un número de entre 0 y 20
		System.out.println("Introduzca un número de entre 0 y 20");
		numero = reader.nextInt();
		
		//Creamos un bucle para mostras los numeros desde 1 hasta el número introducido
		for (int i = 1; i <= numero; i++) {
			//Mostramos el número de i veces
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			
			//Salto de línea entre números
			System.out.println();
		}
		
		//Cerramos el Scanner
		reader.close();
	}

}