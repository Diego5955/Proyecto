	package Tema8_ejer5;

import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array de productos 
		
		Producto[] productos  = new Producto [10];
		
		productos[0] = new Perecedero(1, "Manzana", 2);
		productos[1] = new Perecedero(2, "Pera", 1.5);	
		productos[2] = new Perecedero(3, "Platano", 3);
		productos[3] = new Perecedero(2, "Naranja", 6.7);
		productos[4] = new Perecedero(1, "Fresas", 8.9);
		productos[5] = new Noperecedero("1", "Macarrones", 3);
		productos[6] = new Noperecedero("2", "Arroz", 4.5);
		productos[7] = new Noperecedero("3", "Jamon", 1);
		productos[8] = new Noperecedero("4", "Nueces", 8);
		productos[9] = new Noperecedero("5", "Cereales", 7.7);
		
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i].toString());
			System.out.println(productos[i].calcular(5));
		}
			
		}
		
		
	}


