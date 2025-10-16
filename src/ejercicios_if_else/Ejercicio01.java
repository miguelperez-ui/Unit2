package ejercicios_if_else;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		//nuevo scanner
		Scanner reader= new Scanner(System.in);
		
		//variable para almacenar el numero que pide el programa
		int numero;
		
		//Pregunta un número
		System.out.println("Introduce un número");
		numero= reader.nextInt();
		
		//condición para saber si es par o impar
		if (numero%2 == 0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
		//cerrar el scanner
		reader.close();

	}

}
