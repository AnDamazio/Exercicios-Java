package controle;

import java.util.Scanner;

public class EstruturasDeControleExercicio4 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Double n1 = entrada.nextDouble();
		
		if(n1 % 1 == 0 && n1 % n1 == 0) {
			System.out.println("O n�mero � primo");
		}else {
			System.out.println("O n�mero n�o � primo");
		}
		
		entrada.close();
	}
}
