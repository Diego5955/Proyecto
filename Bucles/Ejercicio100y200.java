package Bucles;

public class Ejercicio100y200 {

	public static void main(String[] args) {

		int contador;
		int numpar=0;
		int numimp=0;
		
		for(  contador =100;contador<=200;contador=contador+1) {
			if ((contador%2)==0) {
				numpar = contador + numpar; 
			}
			else 
			{
				numimp = contador + numimp; 
			}
		}
		System.out.println("Suma numeros pares es igual a " + numpar  );
		System.out.println("Suma numeros impares es igual a " + numimp  );
}
}






