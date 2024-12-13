package ClasesAbstractas;

public class Triangulo extends FiguraGeometrica{
	
	private double base;
	private double altura;

	@Override
	double calcularArea() {
		
		return (base * altura) /2;
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
