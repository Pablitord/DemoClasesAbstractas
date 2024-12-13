package ClasesAbstractas;

public abstract class FiguraGeometrica {
	
	public String nombreFigura;
	
	
	abstract double calcularArea();
	
	public boolean mayorQue(FiguraGeometrica figura) {
		return this.calcularArea() > figura.calcularArea();
	}
	
	public String getNombreFigura(){
		return nombreFigura;
	}
	
	public void setNombreFigura(String nombreFigura) {
		this.nombreFigura = nombreFigura;
	}
	
	
}