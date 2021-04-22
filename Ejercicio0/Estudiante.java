package Ejercicios;

public class Estudiante extends Persona {

	//Atributos
	
	private int Numexpediente;
	private String curso;
	private int [] notas;
	
	//Constructores
	
	public Estudiante() {
		
	}
	
	public Estudiante(int Numexpediente, String curso, int[] notas) {
		this.Numexpediente = Numexpediente;
		this.curso = curso;
		this.notas = notas;
	}

	public Estudiante (String nombre,int edad, int Numexpediente, String curso ) {
		super(nombre,edad);
		this.Numexpediente = Numexpediente;
		this.curso = curso;
	}
	
	//Getters , Setters
	
	public int getNumexpediente() {
		return Numexpediente;
	}

	public void setNumexpediente(int numexpediente) {
		Numexpediente = numexpediente;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	
	//Metodos
	
	
	public double notaMedia() {
		
		return 0;
		
	}
	
}
