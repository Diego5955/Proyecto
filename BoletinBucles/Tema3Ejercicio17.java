/**
 * 
 */
package BoletinBucles;
///Realiza un programa que nos diga si un número es PRIMO. Un numero es primo si

// solo es divisible por 1 y por el mismo

import java.util.Scanner;

/**
 * @author Joaquin Peris Gonzalez y Diego Roig Solis
 *
 */
public class Tema3Ejercicio17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime un numero");

		int numero = teclado.nextInt();
		int contador = 0;

		while (numero!=0)
			
			if (numero % contador != 0)
			{

				System.out.println("Es Primo");
				numero = teclado.nextInt();
			} else {	
			numero = teclado.nextInt();
			}

	
	}

}
