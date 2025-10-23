package ejercicioscondicionales;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Nuevo scanner
		Scanner reader = new Scanner(System.in);

		// Variable de la distancia
		double distancia;

		// Variable de los días de estancia
		int dias;

		// Variable del precio
		double precio;

		// Constante del precio del kilometro
		final double PRECIO_KILOMETRO = 2.5;

		// Constante del descuento que se aplica en el if
		final double DESCUENTO = 0.3;

		// Imprime una pregunta
		System.out.println("¿Cuántoa kilómetros has de recorrer?");
		distancia = reader.nextDouble();

		// Imprime una pregunta
		System.out.println("¿Cuántos días de vas a estar allí?");
		dias = reader.nextInt();

		// Ecuación para calcular el precio del billete
		precio = distancia * PRECIO_KILOMETRO;

		// Condición para saber si aplicar el descuento
		if (dias > 7 && distancia > 800) {
			precio = precio * DESCUENTO;
		}

		// Mensaje que muestra el precio final
		System.out.println("El precio a pagar es de: " + precio);

		// Cerrar scanner
		reader.close();

	}

}
