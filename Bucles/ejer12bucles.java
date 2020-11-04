package Bucles;

import java.util.Scanner;

public class ejer12bucles {

	private static final String Break = null;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cuadrado;
		System.out.println("Introduce un numero: ");
		
		int numero=teclado.nextInt();
		
		while(numero>=0) {
			
			cuadrado= numero* numero;
			System.out.println("El cuadrado de  " + numero + " es " + cuadrado);
			
			break;
			
		}
		
	}

}
