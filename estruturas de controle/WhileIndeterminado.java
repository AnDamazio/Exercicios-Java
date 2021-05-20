package controle;

import java.util.Scanner;

public class WhileIndeterminado {
			
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String fruta = "";
		
		while(!fruta.equalsIgnoreCase("sair")) {
			System.out.println("Digite uma fruta");
			fruta = entrada.next();
		}
		entrada.close();
	}
}
