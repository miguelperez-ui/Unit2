package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		
		//Variable del numero de factoriales
		long factorial=1;
		
		//Variable del número que se pide
		int numero;
		
		//Pide un número
		System.out.println("Introduzca un número");
		numero= reader.nextInt();
		
		//Mientras que el número sea mayorque 1
		for(int cont= numero; cont>=1;cont--) {
			System.out.print(cont);
			if(cont != 1) {
				System.out.print("*");
			}
			factorial *=cont;
		}

		//Imprime el resultado
		System.out.println("=" + factorial);

		//Cerrar scanner
		reader.close();

    }
}

