package ejercicioscondicionales;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		
		double distancia;
		int dias;
		double precio;
		
		
		final double PRECIO_KILOMETRO = 2.5;
		final double DESCUENTO = 0.3;
		
		System.out.println("¿Cuántoa kilómetros has de recorrer?");
		distancia = reader.nextDouble(); 
		
		System.out.println("¿Cuántos días de vas a estar allí?");
		dias = reader.nextInt();
		
		precio= distancia*PRECIO_KILOMETRO;
		
		if (dias>7 && distancia>800) {
			precio= precio*DESCUENTO;
		}
		
		System.out.println("El precio a pagar es de: "+ precio);
		
		reader.close();

	}

}
