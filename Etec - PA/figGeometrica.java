package pa;

public class figGeometrica {
	
	double lado1;
	double lado2;
	String figura;
	
	public figGeometrica(double lado1, 
			double lado2, String figura) {
	this.lado1 = lado1;
	this.lado2 = lado2;
	this.figura = figura;
	}
	
	String exibirDados() {
		
		return String.format("%.2f, %.2f, %s", lado1, lado2, figura);
	}
}
