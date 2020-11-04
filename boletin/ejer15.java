package boletin;

import java.util.Scanner;

public class ejer15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el primer numero");
		int n1=teclado.nextInt();
		System.out.println("Dame el segundo numero");
		int n2=teclado.nextInt();
		System.out.println("Dame el tercer numero");
		int n3=teclado.nextInt();

		if (n1>n2) {

			System.out.println("N1 es mayor que N2");
		}
		else
		{

			System.out.println("N2 es mayor que N1");
		}
		if (n1>n3) {
			
			System.out.println("N1 es mayor que N3");
			}
			else
			{
				
				System.out.println("N3 es mayor que N1");	
			}
		if (n2>n3) {
			
			System.out.println("N2 es mayor que N3");
			}
			else
			{
				
				System.out.println("N3 es mayor que N2");
				
				
				
			}

		
	}

}

