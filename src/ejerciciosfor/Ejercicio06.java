package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		
		double numero;
		int suspenso=0;
		
		for(int contador=0;contador<5;contador++) {
			System.out.println("Dime una calificación");
		    numero=reader.nextInt();
		    
		    if(numero<5) {
		    	suspenso++;
		    }
		}
			
			if(suspenso==1) {
				System.out.println("Has suspendido 1 exámen");
			}else {
				if(suspenso>1) {
					System.out.println("Has suspendido "+ suspenso + " exámenes");
				}else {
					System.out.println("No has suspendido ninguno");
				}
				
			}
		
		
		
		reader.close();

	}

}
