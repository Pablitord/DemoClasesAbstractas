package ClasesAbstractas;

public class Main {

	public static void main(String[] args) {
		FiguraGeometrica rectangulo1 = new Rectangulo(15, 30, "Rectangulo 1");
		FiguraGeometrica rectangulo2 = new Rectangulo(30, 60, "Rectángulo 2");
		
		mostrarArea(rectangulo1);
		mostrarArea(rectangulo2);
		
		FiguraGeometrica rectanguloMayor = CompararFiguras.compararFiguras(rectangulo1, rectangulo2);
		System.out.println("El " + rectanguloMayor.getNombreFigura() + " es mayor\n");
		
		//---------------------------------------------------------------------------------------------------------------------------------
		
		FiguraGeometrica triangulo1 = new Triangulo(45, 20, "Triángulo 1");
		FiguraGeometrica triangulo2 = new Triangulo(25, 10, "Triángulo 2");
		
		mostrarArea(triangulo1);
		mostrarArea(triangulo2);
		
		FiguraGeometrica trianguloMayor = CompararFiguras.compararFiguras(triangulo1, triangulo2);
		System.out.println("El " + trianguloMayor.getNombreFigura() + " es mayor\n");
		
		//----------------------------------------------------------------------------------------------------------------------------------
		
		FiguraGeometrica circulo1 = new Circulo(5, "Círculo 1");
		FiguraGeometrica circulo2 = new Circulo(2.5, "Círculo 2");
		
		mostrarArea(circulo1);
		mostrarArea(circulo2);	
		
		FiguraGeometrica circuloMayor = CompararFiguras.compararFiguras(circulo1, circulo2);
		System.out.println("El " + circuloMayor.getNombreFigura() + " es mayor");

	}
	
	
	private static void mostrarArea(FiguraGeometrica rectangulo) {
		System.out.println("Área del " +  rectangulo.getNombreFigura() + ": " + rectangulo.calcularArea());
	}

}