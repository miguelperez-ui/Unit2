package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
	
		Scanner reader= new Scanner(System.in);
	
	
		int numero;
		int multiplicacion=1;
		int resultado;
		
		System.out.println("Escribe un número:");
		numero=reader.nextInt();
		
		
		do {
			resultado =  numero * multiplicacion;
			System.out.println(numero + "x" + multiplicacion + " = " + resultado);
			multiplicacion++;
		}while (multiplicacion<=10);
	
	
	
	reader.close();

	}

}
