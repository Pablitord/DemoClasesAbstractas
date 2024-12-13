package ClasesAbstractas;

public class Rectangulo extends FiguraGeometrica{
	
	private double base;
	private double altura;
	
	public Rectangulo(double altura, double base, String nombreFigura) {
		super(nombreFigura);
		this.altura = altura;
		this.base = base;
	}


	@Override
	double calcularArea() {
		
		return base * altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
