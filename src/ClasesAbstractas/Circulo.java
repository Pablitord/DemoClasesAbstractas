package ClasesAbstractas;

public class Circulo extends FiguraGeometrica {
	
	private double Pi = Math.PI; //Math.PI para tener el valor exacto de PI
	private double R;
	
	public Circulo(double R, String nombreFigura) {
		super(nombreFigura);
		this.R = R;
	}

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
