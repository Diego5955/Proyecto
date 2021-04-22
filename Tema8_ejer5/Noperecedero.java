package Tema8_ejer5;

public class Noperecedero extends Producto {

	// Atributos

	private String tipo;

	// Constructores

	public Noperecedero(String tipo, String nombre,double precio) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	// Getters , Setters

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
public double calcular(int cantidad) {
		
		double resultado = super.calcular(cantidad);
		
		return resultado;
		
	}
	
}

