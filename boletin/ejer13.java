package boletin;

import java.util.Scanner;

public class ejer13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame  un numero");
		int n1=teclado.nextInt();
		System.out.println("Dame un numero");
		int n2=teclado.nextInt();
		
		if (n1>n2) {
			System.out.println("Aparece en orde ascendente " + n2 + " " + n1);
		}
		else {
			System.out.println("Aparece en orde ascendente " + n1 + " " + n2);
		}
	}

}
