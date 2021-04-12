package Electrodomestico;

public class Lavadora extends Electrodomestico {

	
	private int carga;

	
	public Lavadora() {
		this.carga = 5;
	}

	public Lavadora(int preciBase, int peso, String color, String consumoElectrico, int carga) {
		super(preciBase, peso, color, consumoElectrico);
		this.carga = carga;
	}
	
	public Lavadora(int preciBase, int peso) {
		super(preciBase, peso);
		this.carga = 5;
	}

	
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	
	@Override
	public double precioFinal()
	{
		double preciBase = super.precioFinal();
		if (carga > 30) {
			preciBase = preciBase + 50;
		}

		return preciBase;
	}

}

