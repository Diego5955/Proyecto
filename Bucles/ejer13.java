package Bucles;

import java.util.Scanner;

public class ejer13 {
	// Leer un numero e indicar si es positivo o negativo. El proceso se repetirá
	// hasta que se introduzca un 0.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero=teclado.nextInt();
		
while (numero!=0) {
	if (numero>0) {
	System.out.println("Numero positivo");
	
	break;
}		

else {
	
}
	System.out.println("Numero negativo");

break;
	}
	}
}

