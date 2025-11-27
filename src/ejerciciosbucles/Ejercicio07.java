package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		Scanner reader= new Scanner(System.in);
		
		int filas;
		
		System.out.println("Introduce el número de filas");
		filas=reader.nextInt();
		
		for (int i=1; i<=filas;i++) {
				for (int j=1; j<=i;j++) {
					System.out.print(j);
				}
				for (int k=i-1;k>=1;k--) {
					System.out.print(k);
				}
				System.out.println();
		}
		

		reader.close();
	}

}
