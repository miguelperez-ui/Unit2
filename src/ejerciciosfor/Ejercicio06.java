package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		
		//Variable del número que se pide
		double numero;
		//Variable que cuenta los suspensos
		int suspenso=0;
		
		//Se hace 5 veces
		for(int contador=0;contador<5;contador++) {
			System.out.println("Dime una calificación");
		    numero=reader.nextInt();
		    
		    //Si el número es menor que 5
		    if(numero<5) {
		    	suspenso++;
		    }
		}
			
		//Mensaje final dependiendo de los suspensos
			if(suspenso==1) {
				System.out.println("Has suspendido 1 exámen");
			}else {
				if(suspenso>1) {
					System.out.println("Has suspendido "+ suspenso + " exámenes");
				}else {
					System.out.println("No has suspendido ninguno");
				}
				
			}
		
		
		//Cerrar scanner
		reader.close();

	}

}
