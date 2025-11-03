package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Crear scanner
		Scanner reader = new Scanner(System.in);
		// Variable de los números que se muestran por pantalla
		int numero = 1;

		// Imprimir número hasta que llegue al 20
		do {
			System.out.println(numero);
			numero++;
		} while (numero <= 20);

		// Cerrar scanner
		reader.close();

	}

}
