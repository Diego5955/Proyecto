package boletin;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Dime el valor de el lado");
	int lado = teclado.nextInt();
	int area = lado*lado;
			
	System.out.println("El area del cuadrado es  " + area);

	
	teclado.close();
	}

}
