package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
	
		String s = "Carambolas, X";
		s = s.toUpperCase();
		s = s.replace("X", "Senhora!");
		s = s.concat("!!!!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia, X"
				.replace("X", "Gui").toLowerCase()
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos n�o tem o operador "."
		int a = 3;
		System.out.println(a);
	}
}
