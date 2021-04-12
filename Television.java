package Electrodomestico;

public class Television extends Electrodomestico {

	
	private int resolucion;
	private boolean smartTV;

	
	public Television() {
		resolucion = 20;
		smartTV = false;
	}

	public Television(int preciBase, int peso, String color, String consumoElectrico, int resolucion, boolean smartTV) {
		super(preciBase, peso, color, consumoElectrico);
		this.resolucion = resolucion;
		this.smartTV = smartTV;
	}
	
	public Television(int preciBase, int peso) {
		super(preciBase, peso);
		this.resolucion = 20;
		this.smartTV = false;
	}


	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSmartTV() {
		return smartTV;
	}

	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}
	
	
	@Override
	public double precioFinal() {
		
		double preciBase = super.precioFinal();
		
		if(resolucion > 40) {
			preciBase = preciBase * 0.3 + preciBase; 
		}
		
		if(smartTV == true) {
			preciBase = preciBase + 50;
		}
		
		return preciBase;
	}
}


