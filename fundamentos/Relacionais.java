package fundamentos;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		double nota = 7.3;
		boolean bomComportamento = false;
		//boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && nota >=7;
		String resultado = temDesconto ? "Sim." :"N�o.";
		
		System.out.printf("Tem desconto? %s", resultado);
	}
}
