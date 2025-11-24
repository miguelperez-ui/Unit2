package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio04 {

public static void main(String[] args) {
		
		//Creamos un Scanner para leer datos
		Scanner sc = new Scanner (System.in);
		
		//Declaramos una variable para el primer número
		int numero1;
		
		//Declaramos una variable para el segundo número
		int numero2;
		
		//Pedimos al usuario que introduzca el primer número
		System.out.print("Introduce el primer número: ");
		numero1 = sc.nextInt();
		
		//Pedimos al usuario que introduzca el segundo número
		System.out.print("Introduce el segundo número: ");
		numero2 = sc.nextInt();
		
		//Obtener el máximo de los dos
		int maximo = Math.max(numero1, numero2);
		
		//Creamos una variable para el mínimo común múltiplo
		int mcm = 1;
		
		//Creamos un bucle desde el máximo hacia arriba
		for (int i = maximo; mcm == 1; i++) {
			if (i % numero1 == 0 && i % numero2 == 0) {
				mcm = i;
			}
		}
		
		//Mostramos el resultado
		System.out.println("El mínimo común múltiplo es: " + mcm);
		
		//Cerramos el Scanner
		sc.close();

	}

}