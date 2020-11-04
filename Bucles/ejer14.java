package Bucles;

import java.util.Scanner;

public class ejer14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero;
		int contador = 0;

		do {
			System.out.println("Dime un numero");
			numero = teclado.nextInt();
			contador = contador + 1;
		} while (numero > 0);
		System.out.println("Has introducido esta cantidad de numeros   " + contador);
		System.out.println("Has introducido un numero negativo");
	}
	
}
