package Entregable;

public class revista extends publicaciones {

	//Atributos
	
	private int numero;

	//Constructores
	
	public revista() {
		
	}
	
	public revista(int codigo, String añopubl,boolean prestado, int numero) {
		super(codigo,añopubl,prestado);
		this.numero = numero;
	}

	//Getters , Setters
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//Metodos
	
	@Override
	public String toString() {
		
		return super.toString()+" ,numero= " +numero+"]";
			
	}
	
	
}
