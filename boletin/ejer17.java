package boletin;

import java.util.Scanner;

public class ejer17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime la hora");
		int horas = teclado.nextInt();
		System.out.println("Dime los minutos");
		int minutos = teclado.nextInt();
		System.out.println("Dime los segundos");
		int segundos = teclado.nextInt();

		
		if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59)

		{
			segundos++;
			if (segundos == 60)
			{
		
			segundos = 0;
			minutos++;
			if (minutos == 60)
			{
	
			minutos = 0;

			horas++;
			if (horas == 24)
			

			horas = 0;
		}
			}
		System.out.println("Un segundos despues la hora es " + horas + " hora " + minutos + " minutos " + segundos+ " segundos ");
			
			
		}
		else
			System.out.println("La hora es incorrecta");
				
	}
}
		

	

