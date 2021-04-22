package Ejercicios;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiante c1= new Estudiante("Juan",20,12345,"1ºDAM");
		Coche f1 = new Coche("Renault" , "Clio" , "Rojo");
		
		System.out.println("Los datos del Estudiante a introducir son:" +c1.getNombre()+","+c1.getEdad()+" años,"+" Coche:" +f1.getMarca()+" "+f1.getModelo()+" "+f1.getColor()+", "+ " Numexpediente:" +c1.getNumexpediente()+" curso: "+c1.getCurso());
		
		
		Profesor d1= new Profesor("Fernando",45,"D104");
		Coche v1 = new Coche("Opel" , "Corsa" , "Blanco");
		
		System.out.println(d1.getNombre()+","+d1.getEdad()+" años"+" Coche:" +v1.getMarca()+" "+v1.getModelo()+" "+v1.getColor()+", "+  "Despacho: "+d1.getDespacho()+" Horario Tutorias:"+d1.getConsultas());
		
		
	}

}
