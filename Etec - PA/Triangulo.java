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
			this.tipo = "Equilátero";
		}else if(lado1 == lado2 && lado2 != lado3 
				|| lado1 == lado3 && lado3 != lado2
				|| lado2 == lado3 && lado3 != lado1) {
			this.tipo = "Isósceles";
		}else {
			this.tipo = "Escaleno";
		}
	
	}
	
	String exibirDados() {
		return String.format("O triângulo de lados: %.1f, %.1f, %.1f é do tipo: %s", lado1, lado2, lado3, tipo);
	}
}

