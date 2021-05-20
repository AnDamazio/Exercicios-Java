package pa;

public class NotasMain {
	
	public static void main(String[] args) {
		
		Notas a1 = new Notas("André", 10,
				10, 10);
		
		Notas a2 = new Notas("Kovawski", 10,
				10, 10);
		
		a1.calcularMedia();
		System.out.println(a1.exibirDados());
		
		a2.calcularMedia();
		System.out.println(a2.exibirDados());
	}
}
