public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		// TODO: Aquí se deben instanciar las otras figuras geométricas
        
		Cuadrado a1 = new Cuadrado("Cuadrado a1", 20,20);
		Rectángulo b1 = new Rectángulo("Rectángulo", 50 , 25 );
		
		imprimirCalculo(t1); imprimirCalculo(t2);
		imprimirCalculo(a1); 
		imprimirCalculo(b1);
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		
	}//main
	
	public static void imprimirCalculo(Rectángulo b) {
		System.out.println(b);
		System.out.println("+===============================================================");
		System.out.println("|El área de ["+b.getName()+"] es: " + b.calcularArea() + 
				"\n" + "|El perímetro de ["+b.getName()+"] es: " + b.calcularPerimetro());
		System.out.println("+===============================================================");
	}//imprimirCalculo

	public static void imprimirCalculo(Cuadrado a) {
		System.out.println(a);
		System.out.println("+===============================================================");
		System.out.println("|El área de ["+a.getName()+"] es: " + a.calcularArea() + 
				"\n" + "|El perímetro de ["+a.getName()+"] es: " + a.calcularPerimetro());
		System.out.println("+===============================================================");
	}//imprimirCalculo

	public static void imprimirCalculo(Triangulo t) {
		System.out.println(t);
		System.out.println("+=================================================================");
		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea() + 
				"\n" + "|El perímetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("+==================================================================");
	}//imprimirCalculo
}//class testFiguras