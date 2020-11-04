package boletin;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el precio");
		double precio = teclado.nextDouble();
		System.out.println("Dime el precio del producto");
		double precio1 = teclado.nextDouble();
	
		double porcentaje = precio*100/precio1;
		
		System.out.println("Descuneto "+ porcentaje );
	}

}
