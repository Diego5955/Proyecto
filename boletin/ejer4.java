package boletin;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//lado = 2*pi*r
		//area= pi*(r*r)radio las 2
		//volumen= 0,75*pi*radio a la 3 (radio *radio*radio)
		System.out.println("Dime el radio");
		double pi = 3.14;
		int r = teclado.nextInt();
		double lado = (2*pi)*r;
		double area = pi*(r*r);
		double volumen = 0.75 * pi *(r * r *r);
				
		System.out.println("Area del circulo " + area);
		System.out.println("Volumende la esfera " + volumen);
		System.out.println("Longitud de circuferencia " + lado);
		
	}

}
