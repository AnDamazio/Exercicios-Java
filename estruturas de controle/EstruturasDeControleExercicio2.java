package controle;

import java.util.Scanner;

public class EstruturasDeControleExercicio2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o ano");
		int ano = entrada.nextInt();
		if(ano % 4 == 0) {
			System.out.printf("%d é um ano bissexto", ano);
		}else if(ano % 4 != 0) {
			System.out.printf("%d não é um ano bissexto", ano);
		}
		
		
		entrada.close();
	}
	
	
}
