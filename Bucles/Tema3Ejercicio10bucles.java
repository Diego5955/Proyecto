package Bucles;

import java.util.Scanner;

public class Tema3Ejercicio10bucles {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero=teclado.nextInt();
		int contador = 1;
		int suma=0;
	while(contador<=numero) {
		suma=contador+numero;
		contador =contador+1;
		
		
	}
System.out.println("La suma es  " + suma);
		}
		
	}

