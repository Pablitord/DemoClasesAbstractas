package ClasesAbstractas;

public class Main {

	public static void main(String[] args) {
		Rectangulo rectangulo1 = new Rectangulo();
		
		rectangulo1.setAltura(15);
		rectangulo1.setBase(30);
		rectangulo1.setNombreFigura("Rectángulo 1: ");
		System.out.println("Área del " + rectangulo1.nombreFigura + rectangulo1.calcularArea());
		
		Rectangulo rectangulo2 = new Rectangulo();
		
		rectangulo2.setAltura(30);
		rectangulo2.setBase(60);
		rectangulo2.setNombreFigura("Rectángulo 2: ");
		System.out.println("Área del " + rectangulo2.getNombreFigura()+ rectangulo2.calcularArea());
		
		if (rectangulo1.mayorQue(rectangulo2)) {
			System.out.println("El " + rectangulo1.getNombreFigura() + " es mayor que el " + rectangulo2.getNombreFigura() ) ;
		} else {
			System.out.println("El " + rectangulo2.getNombreFigura() + " es mayor que el " + rectangulo1.getNombreFigura());
		}
		
		Triangulo triangulo1 = new Triangulo();
		
		triangulo1.setAltura(45);
		triangulo1.setBase(20);
		triangulo1.setNombreFigura("Triángulo 1: ");
		System.out.println("\nÁrea del " + triangulo1.getNombreFigura() + triangulo1.calcularArea() );
		
		Triangulo triangulo2 = new Triangulo();
		
		triangulo2.setAltura(25);
		triangulo2.setBase(10);
		triangulo2.setNombreFigura("Triángulo 2: ");
		System.out.println("Área del " + triangulo2.getNombreFigura() + triangulo2.calcularArea());
		
		if (triangulo1.mayorQue(triangulo2)){
			System.out.println("El " + triangulo1.getNombreFigura() + " es mayor que el " + triangulo2.getNombreFigura());
		} else {
			System.out.println("El " + triangulo2.getNombreFigura() + " es mayor que el " + triangulo1.getNombreFigura());
		}
		
		Circulo circulo1 = new Circulo();
		
		circulo1.setR(5);
		circulo1.setNombreFigura("Círculo 1: ");
		System.out.println("\nÁrea del " + circulo1.getNombreFigura() + circulo1.calcularArea());
		
		Circulo circulo2 = new Circulo();
		
		circulo2.setR(2.5);
		circulo2.setNombreFigura("Círculo 2: ");
		System.out.println("Área del " + circulo2.getNombreFigura() + circulo2.calcularArea());
		
		if (circulo1.mayorQue(circulo2)) {
			System.out.println("El " + circulo1.getNombreFigura() + " es mayor que el " + circulo2.getNombreFigura());
		} else {
			System.out.println("El " + circulo2.getNombreFigura() + " es mayor que el " + circulo1.getNombreFigura());
		}
		
		
		
		
		
		
		
		
		
		


	}

}