package pa;

public class trianguloRetanguloMain {
	
	public static void main(String[] args) {
		
		trianguloRetangulo t1 = new trianguloRetangulo(3,3, "triangulo1");
		trianguloRetangulo t2 = new trianguloRetangulo(6,6, "triangulo");
	
		t1.calcularArea();
		t2.calcularArea();
		System.out.println(t1.exibirDados());
		System.out.println(t2.exibirDados());
	}
}
