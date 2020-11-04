package Bucles;

import java.util.Scanner;

public class Condicial {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Ingrese un numero");
		numero = teclado.nextInt();
		if (numero > 0)
			System.out.println("es positivo");
		else
			System.out.println("es negativo");
	}
}