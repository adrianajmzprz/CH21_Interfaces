
public class Cuadrado {
	private String name;
	private double base;
	private double altura;
	public Cuadrado(String name, double base, double altura) {
		this.name = name;
		this.base = base;
		this.altura = altura;
	}//constructor
	
	public double calcularArea() {
		return (getBase() + getBase() + getBase() + getBase());	
	}//calcularArea
	public double calcularPerimetro() {
		return (getBase() * getAltura());
	}// calcularPerimetro
	
	
	public String getName() {
		return name;
	}//getName
	public void setName(String name) {
		this.name = name;
	}//setName

	public double getBase() {
		return base;
	}//getBase
	public void setBase(double base) {
		this.base = base;
	}//setBase
	public double getAltura() {
		return altura;
	}//getAltura
	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura

	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", base=" + base + ", altura=" + altura + "]";
	}
	
	//paso3
	
}//class Cuadrado
