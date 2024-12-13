package ClasesAbstractas;

public class CompararFiguras {
	
	public static FiguraGeometrica compararFiguras(FiguraGeometrica figura1, FiguraGeometrica figura2) {
		
		if (figura1.calcularArea() > figura2.calcularArea()) {
			
			return figura1;
		} else {
			
			return figura2;
		}
		
	}

}
