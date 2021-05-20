package controle;

import java.util.Scanner;

public class EstruturasDeControleExercicio4 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Double n1 = entrada.nextDouble();
		
		if(n1 % 1 == 0 && n1 % n1 == 0) {
			System.out.println("O número é primo");
		}else {
			System.out.println("O número não é primo");
		}
		
		entrada.close();
	}
}
