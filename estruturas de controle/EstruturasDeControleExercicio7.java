package controle;

import java.util.Scanner;

public class EstruturasDeControleExercicio7 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double y = 0;
		int contador = 10;
		System.out.println("Digite um número: ");
		double x = entrada.nextInt();
		
		
			
		do {
			System.out.println("Digite um número: ");
			y = entrada.nextDouble();
			contador --;
			if(x < y) {
				x = y;
			}
		}while(contador != 0);
		
			System.out.printf("O maior número é: %f", x);
			entrada.close();
		}
}

