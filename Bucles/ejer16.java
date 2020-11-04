package Bucles;

import java.util.Scanner;

public class ejer16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Pedir números hasta que se introduzca uno negativo, y calcular la media.
		int numero;
		int resul2 = 0;
		int media = 0;
		int resul = 0;
		System.out.println("Dime un numero");
		numero = teclado.nextInt();
		while (numero >= 0)
			
		{
			resul2 = resul2 + numero;
			resul = resul + 1;
			media = resul2 / resul;
			System.out.println("Dime otro numero");
			numero = teclado.nextInt();
			
		}
		System.out.println("La media es " + media);
	}
}
