package Bucles;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int contador = 0;

		do {
			System.out.println("Dime un numero");
			numero = teclado.nextInt();
			contador +=numero;
		} while (numero!=0);
		System.out.println(contador);
		
	}
	
}
