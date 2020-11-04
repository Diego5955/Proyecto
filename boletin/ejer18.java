package boletin;

import java.util.Scanner;

public class ejer18 {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);

		String nombre;
		String apellido;
		String apellido2;	 


		int ht = 0;
		int ph= 10;
		int hx=0;

		double sb = 0;
		double sn = 0;

		int tn=0;
		double tx=0;

		double sbi1 = 0;
		double sbi2 = 0;

		double imp1=0;
		double imp2=0;

		double tass = 0;

		System.out.println("Dime tu nombre");
		nombre = teclado.nextLine();
		System.out.println("Dime tu primer apellido");
		apellido = teclado.nextLine();
		System.out.println("Dime tu segundo apellido");
		apellido2 = teclado.nextLine();
		System.out.println("Dime horas trabajadas");
		ht = teclado.nextInt();
		
		if (ht >35)
		{
			tn = 35* ph;
			hx=ht - 35;
			tx = ph * 1.5;
			sb = hx * tx + tn;
		}
		else {

			hx =0;
			tn = ht*ph;
			sb=tn;

		}
		if  (sb > 500) 
		{  
			sbi1 = sb - 500;
			 
			if (sbi1 > 400) {
			
				
			
			
			sbi2 = sbi1 - 400;
			sbi1 = 400;
			
			imp1 = sbi1 * 0.25;
			imp2 = sbi2 * 0.45;
			
			tass = imp1 + imp2;		
			
			sn = sb - tass;
		}
			else {
				
				imp1 = sbi1 * 0.25;
				imp2 = 0;
				
				tass = imp1 + imp2;	
			
				sn = sb -tass;
			}
	}else  {
			sn = sb;
		}
			
		System.out.println("Salario brutal es "+  sb);	
		System.out.println("Las tasas a pagar son "+ tass);
		System.out.println("Salario neto es "+ sn);
			
		}

	}


















