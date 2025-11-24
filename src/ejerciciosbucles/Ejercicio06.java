package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una variable para el número de base y altura
		int numero;
		
		//Pedimos un número
		System.out.println("Introduzca un número");
		numero = sc.nextInt();
		
		//Creamos un bucle para mostrar la pirámide
		for (int fila = 1; fila <= numero; fila++) {
			//Mostramos los espacios en blanco
			for (int espacio = 0; espacio < numero-fila; espacio++) {
				System.out.print(" ");
			}
			//Mostramos los asteriscos
			for (int asterisco = 0; asterisco < fila; asterisco++) {
				System.out.print("* ");
			}
			//Salto de línea entre filas
			System.out.println();
		}
		
		//Cerramos el Scanner
		sc.close();
		
		
	}

}
