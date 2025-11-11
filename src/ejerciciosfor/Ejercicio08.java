package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a;
		int b;

		System.out.println("Dime un número");
		a = reader.nextInt();

		System.out.println("Dime otro número");
		b = reader.nextInt();

		if (a > b) {
			for (int contador = b; contador <= a; contador++)
				System.out.println(contador);
		} else {

			for (int contador = a; contador <= b; contador++)
				System.out.println(contador);

		}

		reader.close();

	}

}
