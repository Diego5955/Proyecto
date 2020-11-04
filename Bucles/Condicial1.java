package Bucles;

import java.util.Scanner;

public class Condicial1 {

	public static void main(String[] args) {
		  int numero1, numero2;
		  Scanner teclado = new Scanner(System.in);
	        
	         System.out.println("Introduce un numero entero:");
	         numero1 =teclado.nextInt();
	         System.out.println("Introduce otro numero entero:");
	         numero2  =teclado.nextInt();
	      
	         if (numero1 % numero2 == 0) {
	              System.out.println("Son multiplos");
	         }

	         else {
	              System.out.println("No son multiplos");
	         }
	     }

	}