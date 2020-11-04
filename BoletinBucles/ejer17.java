/**
 * 
 */
package BoletinBucles;

import java.util.Scanner;

/**
 * @author Joaquin Peris Gonzalez y Diego Roig Solis
 *
 */
public class ejer17 {

	/**
	 * @param Utilizamos tres variables que en este caso tiene los nombres de numero que es el numero que tienes que saber si  es primo o no , luego estan las variables contador y contador 1
	 * que se utilizan para que se vayan sumando y depues se divida ese contador con el numero que hayas indicado.Hacemos un for para  
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime un numero");

		int numero = teclado.nextInt();
		int contador = 1;
		int contador2 = 0;

		for (contador = 1; contador <= numero; contador++) {
			if ((numero % contador) == 0)

				contador2++;

		}
		if (contador2 <= 2) {

			System.out.println("Es Primo");

		} else {
			System.out.println("No es Primo");
		}

	}

}
