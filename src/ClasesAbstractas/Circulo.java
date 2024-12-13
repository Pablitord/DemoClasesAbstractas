package ClasesAbstractas;

public class Circulo extends FiguraGeometrica {
	
	private double Pi = 3.1426;
	private double R;

	@Override
	double calcularArea() {
		
		return Pi * Math.pow(R, 2);
	}

	public double getPi() {
		return Pi;
	}

	public void setPi(double pi) {
		Pi = pi;
	}

	public double getR() {
		return R;
	}

	public void setR(double r) {
		R = r;
	}

}
