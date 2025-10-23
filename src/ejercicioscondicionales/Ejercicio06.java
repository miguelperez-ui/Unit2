package ejercicioscondicionales;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		
		int mes;
		int ano;
		int dia=0 ;
		
		boolean esBisiesto;
		
		System.out.println("Introduce un número de mes");
		mes= reader.nextInt();
		
		System.out.println("Introduce un año");
		ano= reader.nextInt();
		
		esBisiesto= ano%4==0;
		
	switch(mes) {
		case 1, 3, 5, 7, 8, 10, 12: 
			dia= 31;
		    break;
		case 4, 6 , 9, 11: 
			dia= 30;
		    break;
		case 2:
			if (esBisiesto) {
				dia=29;
			}else {
				dia=28;
			}
			 break;
		default: 
			System.out.println("El mes tiene que ser entre 1 y 12 ");
			break;
	}
		
			
			System.out.println("Ese mes tiene "+ dia + " días.");
			
		
		
		
		reader.close();
		}
	}



