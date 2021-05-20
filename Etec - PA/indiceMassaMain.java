package pa;

public class indiceMassaMain {
	
	public static void main(String[] args) {
		
		indiceMassa p1 = new indiceMassa("André", "Masculino",
				1.73);
		
		indiceMassa p2 = new indiceMassa("Ana", "Feminino",
				1.94);
		
		p1.calcularIMC();
		p2.calcularIMC();
		System.out.println(p1.exibirDados());
		System.out.println(p2.exibirDados());
	}
}
