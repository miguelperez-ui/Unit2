package ejercicioscondicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un número de DNI");
		numero=reader.nextInt();
		
		if (numero<10000000 || numero>99999999) {
			System.out.println("Error, el número tieneque tener 8 cifras");
		}else {
			
		}
		
	
		
		reader.close();

	}

}
