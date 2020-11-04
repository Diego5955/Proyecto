package Bucles;

import java.util.Scanner;

public class Tema3Ejercicio9bucles {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime un numero");

		int contador = teclado.nextInt();
		do {

			if (contador % 2 == 0) {
				System.out.println("Es par ");
				break;
			} else {

				System.out.println("Es impar ");
				break;
			}
		} while (contador != 0);
		{
		}

	}
}
