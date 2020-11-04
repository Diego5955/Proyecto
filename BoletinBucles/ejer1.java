package BoletinBucles;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero=0;
		int contador=1;
		int resul;
		
		for (numero=0;contador<=20;contador++) {
			
			resul = numero+contador;
			System.out.println( resul  );
		}
		
	}

}
