package Bucles;

import java.util.Scanner;

public class Tema3Ejercicio11bucles {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero = teclado.nextInt();
		int contador = 1;
		int multi = 1;

		while (contador <= numero) {

			multi = contador * multi;

			contador = contador + 1;

		}
		System.out.println("La multi " + multi);
	}
}
