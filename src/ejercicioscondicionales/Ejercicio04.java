package ejercicioscondicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		
		Random aleatorio =new Random();
		
		int num1 = aleatorio.nextInt(1,100);
		
		int num2 = aleatorio.nextInt(1,100);
		
		int suma = num1 + num2;
		
		int sumaUsuario;
		
		
		System.out.println("Número 1: "+ num1);
		
		System.out.println("Número 2: "+ num2);
		
		System.out.println("¿Cuánto es la suma de " + num1 + "y" + num2 + "?");
		sumaUsuario=reader.nextInt();
		
		
		if (sumaUsuario == suma) {
			System.out.println("¡CORRECTO!");
		}else {
			System.out.println("¡INCORRECTO!, la suma es "+ suma);
		}
		
		
		reader.close();
		
		
		
		

	}

}
