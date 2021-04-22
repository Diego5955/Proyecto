package Ejercicios;

public class Profesor extends Persona {

	//Atributos
	
	private String despacho;
	private String horarioTutorias;
	
	//Constructores
	
	public Profesor(){
		
	}
	
	public Profesor(String despacho, String horarioTutorias) {
		super();
		this.despacho = despacho;
		this.horarioTutorias = horarioTutorias;
	}
	
	public Profesor(String nombre,int edad, String despacho ) {
		super(nombre,edad);
		this.despacho = despacho;
	}
		
		//Getters , Setters
		
		public String getDespacho() {
			return despacho;
		}

		public void setDespacho(String despacho) {
			this.despacho = despacho;
		}

		public String getHorarioTutorias() {
			return horarioTutorias;
		}

		public void setHorarioTutorias(String horarioTutorias) {
			this.horarioTutorias = horarioTutorias;
		}
		
		
		
		//Metodos
		
		public String getConsultas() {
			
			return "  lunes de 12 a 13h ";
		}
		
		
	}

	
	

