package Electrodomestico;

import java.util.regex.Pattern;

public class Main {

		public static void main(String[] args) {
			
			Electrodomestico[] elec = new Electrodomestico[8];

			elec[0] = new Lavadora(10, 40);
			elec[1] = new Lavadora(5, 30);
			elec[2] = new Lavadora(90, 85);
			elec[3] = new Television(34, 22);
			elec[4] = new Television(55, 79);
			elec[5] = new Television(69, 35);
			elec[6] = new Electrodomestico(50, 80, "rosa", "D");
			elec[7] = new Electrodomestico(26, 49, "negro", "B");
			elec[7] = new Electrodomestico(34, 42, "azul", "A");
			
			for (int i = 0; i < elec.length; i++) {
				System.out.println(elec[i].precioFinal());
			}
			 
			 double preciLav = 0;
			 double preciTel = 0;
			 double preciElec = 0;
			 
			 for (int i = 0; i < elec.length; i++) {
				 
				 String clase = String.valueOf(elec[i].getClass());
				 String [] clases = clase.split(Pattern.quote("."));
				 
				 switch(clases[1]){
				case "Lavadora" :
					preciLav = preciLav + elec[i].precioFinal();
					break;
				case "Television":
					preciTel = preciTel + elec[i].precioFinal();
					break;
				case "Electrodomestico":
					preciElec = preciElec + elec[i].precioFinal();
					break;
				}
			}
			 
			 
			 preciElec = preciElec + preciLav + preciTel;
			 
			 System.out.printf("La suma de Electrodomesticos es de = " + preciElec + " € , la suma de Television es de = " + preciTel + " € y La suma de lavadoras es de = " + preciLav + " €");
		}

	}


