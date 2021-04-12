package Electrodomestico;

import java.util.Arrays;

public class Electrodomestico {

		
		private int preciBase;
		private String color;
		private int peso;
		private String consumoElectrico;

	
		public Electrodomestico() {
			color = "blanco";
			consumoElectrico = "F";
			preciBase = 100;
			peso = 5;
		}

		public Electrodomestico(int precioBase, int peso, String color, String consumoElectrico) {
			this.color = color;
			this.consumoElectrico = consumoElectrico;
			this.preciBase = preciBase;
			this.peso = peso;
		}
		
		public Electrodomestico(int preciBase, int peso) {
			color = "blanco";
			consumoElectrico = "F";
			this.preciBase = preciBase;
			this.peso = peso;
		}

		public int getPrecioBase() {
			return preciBase;
		}

		public void setPrecioBase(int precioBase) {
			this.preciBase = precioBase;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getPeso() {
			return peso;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}

		public String getConsumoElectrico() {
			return consumoElectrico;
		}

		public void setConsumoElectrico(String consumoElectrico) {
			this.consumoElectrico = consumoElectrico;
		}

		
		private void comprobarConsumo() {
		

			if (consumoElectrico != "A" || consumoElectrico != "B" || consumoElectrico != "C" || consumoElectrico != "D" || consumoElectrico != "E" || consumoElectrico != "F") {
				consumoElectrico = "F";
			}else {
				
				consumoElectrico = consumoElectrico;
			}
		}

		private void comprobarColor() {
			
			
			if (color != "blanco" || color != "negro" || color != "rojo" || color != "azul" || color != "gris") {
				consumoElectrico = "F";
			}else {
				
				color = color;
			}
		}

		public double precioFinal() {
			

			switch (consumoElectrico) {
			case "A":
				preciBase = preciBase + 100;
				break;
			case "B":
				preciBase = preciBase + 80;
				break;
			case "C":
				preciBase = preciBase + 60;
				break;
			case "D":
				preciBase = preciBase + 50;
				break;
			case "E":
				preciBase = preciBase + 30;
				break;
			case "F":
				preciBase = preciBase + 10;
				break;
			}

			if (peso <= 19) {
				preciBase = preciBase + 10;
			} else {
				if (peso >= 20 && peso <= 49) {
					preciBase = preciBase + 50;
				} else {
					if (peso >= 50 && peso <= 79) {
						preciBase = preciBase + 80;
					} else {
						if (peso > 79) {
							preciBase = preciBase + 100;
						}
					}
				}
			}
			return preciBase;
		}

	}

