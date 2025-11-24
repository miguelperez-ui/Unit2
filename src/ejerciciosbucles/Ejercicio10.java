package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int numero;
		
		int numInvertido = 0;
		
		int numAux;
		
		int ultimaCifra;
		
		Scanner reader= new Scanner(System.in);
		
		System.out.println("Introduzca un número:");
		numero= reader.nextInt();
		
		numAux= numero;
		
		while(numAux>0) {
			ultimaCifra=numAux%10;
			numInvertido=numInvertido*10 + ultimaCifra;
			numAux /= 10;
		}

		System.out.println(numInvertido==numero? "Es capicúa": "No es capicúa");
		
		reader.close();
	}

}
