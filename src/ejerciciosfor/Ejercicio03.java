package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		
		int numero;
		int suma=0;
		double media;
		
		for (int contador=1; contador<=10; contador++) {
			System.out.println("Dame un número");
			numero=reader.nextInt();
			
			suma+=numero;
		}
		media=suma/10.0;
		
		System.out.println("La media es: "+ media);
		
		reader.close();

	}

}
