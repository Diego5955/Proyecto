package Ejercicios;

public class Coche {

	private String marca;
	private String modelo;
	private String color;


	public Coche(String marca, String modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	
	
	
}
