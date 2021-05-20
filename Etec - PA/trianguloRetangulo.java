package pa;

public class trianguloRetangulo {
	
	double area;
	double base;
	double altura;
	String figGeometrica;
	
	public trianguloRetangulo(double base, double altura, String figGeometrica) {
		
		this.base = base;
		this.altura = altura;
		this.figGeometrica = figGeometrica;
	}
	
	Double calcularArea() {
		area = (base * altura) /2;
		return  area;
	}
	
	String exibirDados() {
		
		return String.format("%.2f, %.2f, %s, %s", base, altura, figGeometrica, area);
	}
}
