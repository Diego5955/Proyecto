package boletin;

import java.util.Scanner;

public class ejer16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime la nota");
		int nota = teclado.nextInt();

		if (nota <= 3) {
			if (nota == 0)

				System.out.println("Muy Deficiente");
		} else {
			if (nota < 5) {

				System.out.println("Insuficiente");
			} else {
				if (nota <= 6) {

					System.out.println("Bien");
				} else {
					if (nota < 9) {

						System.out.println("Notable");
					} else {
						if (nota <= 10) {

							System.out.println("Sobresaliente");
						}

					}
				}

			}

		}

	}

}
