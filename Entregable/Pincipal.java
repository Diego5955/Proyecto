package Entregable;

public class Pincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		publicaciones [] p = new publicaciones[8];
		
		p[0] = new revista(01,"1920",true,1);
		p[1] = new revista(02,"1921",false,2);
		p[2] = new revista(03,"1922",true,3);
		p[3] = new revista(04,"1923",false,4);
		p[4] = new libro(01,"1920",true,"Jorge");
		p[5] = new libro(01,"1920",false,"Joaquin");
		p[6] = new libro(01,"1920",true,"Diego");
		p[7] = new libro(01,"1920",false,"Ripoll");
		
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].toString());
		}
		
		
		System.out.println("Revista 1:");
		p[0].devolver(1);
		p[1].devolver(2);
		p[2].prestar(2);
		p[3].prestar(1);
		p[4].devolver(2);	
		p[5].devolver(1);
		p[6].prestar(1);
		p[7].prestar(2);
	}

}
