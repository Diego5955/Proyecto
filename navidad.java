package P326Navidad;

import java.util.Scanner;

public class navidad {

	
		public static void main(String[] args) {
			

			Scanner teclado = new Scanner(System.in);
			
			int N = teclado.nextInt();
			int dia;
			int mes;
			
			
			for (int cont = 1; cont < N; cont++) {
			
				dia = teclado.nextInt();
				mes = teclado.nextInt();

				if(dia == 25){
					if(mes == 12){
						System.out.println("SI");
					} else {
						System.out.println("NO");
					}
				} else {
					System.out.println("NO");
				}

			}

		}

	}