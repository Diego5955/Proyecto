package boletin;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime millas");
		double milla =teclado.nextInt();
		
		double metros =milla*1.852;
	
		System.out.println("El numero de  millas " + metros + " metros " );
		
		
		
	}

}
