package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		
		long factorial=1;
		
		int numero;
		
		System.out.println("Introduzca un número");
		numero= reader.nextInt();
		
		for(int cont= numero; cont>=1;cont--) {
			System.out.print(cont);
			if(cont != 1) {
				System.out.print("*");
			}
			factorial *=cont;
		}

		System.out.println("=" + factorial);

		reader.close();

    }
}

