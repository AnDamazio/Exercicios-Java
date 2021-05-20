package pa;

public class Triangulo {
	
	double lado1;
	double lado2;
	double lado3;
	String tipo;

	
	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;

		
	}
	void calcularTriangulo() {
		if(lado1 == lado2 && lado2 == lado3) {
			this.tipo = "Equil�tero";
		}else if(lado1 == lado2 && lado2 != lado3 
				|| lado1 == lado3 && lado3 != lado2
				|| lado2 == lado3 && lado3 != lado1) {
			this.tipo = "Is�sceles";
		}else {
			this.tipo = "Escaleno";
		}
	
	}
	
	String exibirDados() {
		return String.format("O tri�ngulo de lados: %.1f, %.1f, %.1f � do tipo: %s", lado1, lado2, lado3, tipo);
	}
}

