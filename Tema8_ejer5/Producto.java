package Tema8_ejer5;

public class Producto {

	//Atributos
	
	private String nombre;
	private double precio;
	
	//Constructores
	
	public Producto() {
		
	}
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//Getters , Setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//Metodos
	
	public double calcular(int cantidad) {
		
		double resultado = precio * cantidad;
		
		return resultado;
		
	}
	
	 @Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}
}

