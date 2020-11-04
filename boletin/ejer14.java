package boletin;

import java.util.Scanner;

public class ejer14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);


		System.out.println("Dame el primer numero");
		int n1=teclado.nextInt();
		System.out.println("Dame el segundo numero");
		int n2=teclado.nextInt();

		if (n1==n2)
		{
			System.out.println("N1 es igual que N2");
		}
		else {if (n1>n2) {

			System.out.println("N1 es mayor que N2");
		}
		else
		{

			System.out.println("N2 es mayor que N1");		
		}

		}
	}
}





