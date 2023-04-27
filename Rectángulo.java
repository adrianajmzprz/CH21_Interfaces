
public class Rectángulo {
	private String name;
	private double base;
	private double altura;
	public Rectángulo(String name, double base, double altura) {
		this.name = name;
		this.base = base;
		this.altura = altura;
	}//constructor
	
	public double calcularArea() {
		return (getBase() + getBase() + getAltura() + getAltura());	
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
		return "Rectángulo [name=" + name + ", base=" + base + ", altura=" + altura + "]";
	}//toString
	
}//class Rectángulo
