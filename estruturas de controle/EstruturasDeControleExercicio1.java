package controle;

import java.util.Scanner;

public class EstruturasDeControleExercicio1 {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		Integer numero = entrada.nextInt();

		if(numero <= 10 && numero >= 0){
				if(numero % 2 == 0) {
					System.out.println("O número é par e está entre 0 e 10");
			}else if(numero % 2 != 0) {
				System.out.println("O número é impar e está entre 0 e 10");
				}
	}
		if(numero > 10 || numero < 0) {
			if(numero % 2 == 0) {
				System.out.println("O numero é par e não está entre 0 e 10");
			}else if(numero % 2 != 0) { 
				System.out.println("O numero é ímpar e não está entre 0 e 10");
			}
		}
		
		entrada.close();
	}
}
