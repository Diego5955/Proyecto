package Entregable;

public class revista extends publicaciones {

	//Atributos
	
	private int numero;

	//Constructores
	
	public revista() {
		
	}
	
	public revista(int codigo, String a�opubl,boolean prestado, int numero) {
		super(codigo,a�opubl,prestado);
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
