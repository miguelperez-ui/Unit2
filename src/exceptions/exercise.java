package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		
		//Preguntamos la edad del usuario
		System.out.println("Introduce tu edad:");
		
		try {
			/*Bloque try
			 * 
			 * Aqui va el codigo que puede fallar
			 * Si cualquier instruccion del bloque genera una excepcion,
			 * Java va a saltar al bloque catch correspondiente.
			 */
			int edad;
			
			edad= reader.nextInt();//Esta linea puede lanzar InputMismatchException, si se escriben simbolos, letras...
			
			/*ASERCION
			 * 
			 * comprobar que la edad introducida tiene sentido.
			 * Las aserciones son comprobaciones internas del programador. Se activan con -ea
			 * Si la condicion es falsa----> se lanza AssertionError
			 */
			
			assert (edad >=0 && edad <=130): "Edad no propia de los seres humanos.";
				
				//Si no ha fallado nada, llegamos aqui
				
				System.out.println("Registro completado correctamente");
				System.out.println("Edad introducida: " + edad);
		}catch (InputMismatchException e) {
			/*PRIMER CATCH
			 * Este bloque captura errores de tipo InputMismatchException, es decir,
			 * cuando el usuario introduce algo qye NO es un numero entero valido
			 */
			System.out.println("ERROR: Debes introducir un número entero valido.");
			
		}catch (AssertionError e) {
			/*SEGUNDO CATCH
			 * Capturar los errores de asercion.
			 * Esto ocurre si la edad NO esta dentro del rango que hemos definido.
			 */
			System.out.println("ERROR DE VALIDACIÓN INTERNA: " + e.getMessage());
		}catch (Exception e) {
			/*ULTIMO CATCH (General)
			 * Captura cualquier otro tipo de exception no prevista en casos anteriores.
			 */
			System.out.println("Error no identificado");
		}finally {
			/*BLOQUE FINALLY
			 * Este bloque se ejecuta SIEMPRE
			 * -Haya o no exception
			 * -Se hayan cumplido o no las aserciones
			 * -Da igual cuantos catch se ejecuten
			 */
			System.out.println("Cerrando recursos...");
			reader.close();
			
		}
		/* FIN DEL PROGRAMA
		 * Ya fuera del TRY-CATCH-FINALLY el programa se ejecuta normalmente.
		 */
		 
		System.out.println("Programa terminado!");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
