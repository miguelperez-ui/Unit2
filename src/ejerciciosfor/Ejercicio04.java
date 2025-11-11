package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		
		int suma=0;
		int impar=1;
		
		for (int contador=1; impar<=20;contador++) {
			if (contador%2 !=0) {
				impar+=2;;
			 System.out.print(impar);
			 System.out.print("+");
			}
			suma+=impar;
		}
		
		System.out.println("="+ suma);
		
		reader.close();

	}

}
