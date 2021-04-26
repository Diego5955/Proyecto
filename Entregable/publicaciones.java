package Entregable;

public class publicaciones implements Ejercicio2 {

	// Atributos

	private int codigo;
	private String añopubl;
	private boolean prestado;

	// Constructores

	public publicaciones() {

	}

	public publicaciones(int codigo, String añopubl, boolean prestado) {

		this.codigo = codigo;
		this.añopubl = añopubl;
		this.prestado = prestado;
	}

	public publicaciones(int codigo, String añopubl) {

		this.codigo = codigo;
		this.añopubl = añopubl;
	}

	// Getters , Setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getAñopubl() {
		return añopubl;
	}

	public void setAñopubl(String añopubl) {
		this.añopubl = añopubl;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	// Metodos

	public String toString() {
		return "publicaciones [codigo=" + codigo + ", añopubl=" + añopubl + ", prestado=" + prestado + "";
	}

	@Override
	public boolean prestado() {
		// TODO Auto-generated method stub

		boolean resu = false;

		if (prestado) {
			resu = true;
		}

		return resu;

	}

	@Override
	public void prestar(int num) {
		// TODO Auto-generated method stub

		if (num == 1) {
			if(prestado()) {
			System.out.println("El libro esta prestado ");
		} else {
			System.out.println("El libro no esta prestado");

		}}else {
			if(num == 2) {
				if(prestado()) {
					System.out.println("La revista esta prestada ");
				} else {
					System.out.println("La revista no esta prestada");

				}
			}
		}	
		}

	@Override
	public void devolver(int num) {
		// TODO Auto-generated method stub

		if (num == 1) {
			if(prestado()) {
			System.out.println("El libro ha sido devuelto ");
		} else {
			System.out.println("El libro no ha sido devuelto");

		}}else {
			if(num == 2) {
				if(prestado()) {
					System.out.println("La revista ha sido devuelto ");
				} else {
					System.out.println("La revista no ha sido devuelto");

				}
			}
			
		}
		}
	}


