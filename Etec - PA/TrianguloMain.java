package pa;

public class TrianguloMain {
	
	public static void main(String[] args) {
		
		Triangulo d1 = new Triangulo(3, 3, 3);
		Triangulo d2 = new Triangulo(2, 3, 2);
		
		d1.calcularTriangulo();
		d2.calcularTriangulo();
		System.out.println(d1.exibirDados());
		System.out.println(d2.exibirDados());
	}
}
