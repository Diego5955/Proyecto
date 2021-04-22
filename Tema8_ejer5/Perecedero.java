package Tema8_ejer5;

public class Perecedero extends Producto {

	// Atributos

	private int diasAcaducar;

	// Constructores

	public Perecedero(int diasAcaducar , String nombre, double precio) {
		super(nombre,precio);
		this.diasAcaducar = diasAcaducar;
	}

	// Getters , Setters

	public int getDiasAcaducar() {
		return diasAcaducar;
	}

	public void setDiasAcaducar(int diasAcaducar) {
		this.diasAcaducar = diasAcaducar;
	}

	// Metodos (Override)

	@Override
	public double calcular(int cantidad) {

		double preciofinal = 0;

		if (diasAcaducar == 1) {
			preciofinal = super.calcular(cantidad) / 4;
		}
		if (diasAcaducar == 2) {
			preciofinal = super.calcular(cantidad) / 3;
		}
		if (diasAcaducar == 3) {
			preciofinal = super.calcular(cantidad) / 2;
		}

		return preciofinal;

	}

}
