package Entregable;

public class libro extends publicaciones{

	//Atributos
	
	private String autor;

	//Constructores
	
	public libro() {
		
	}
	
	public libro(int codigo, String a�opubl, boolean prestado, String autor) {
		super(codigo,a�opubl,prestado);
		this.autor = autor;
	}

	//Getters , Setters
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	//Metodos
	
	@Override
	public String toString() {
		
		return super.toString()+ " ,autor="+autor+"]";
	}
	
}
