package controle;

import java.util.Scanner;

public class EstruturasDeControleExercicio1 {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		Integer numero = entrada.nextInt();

		if(numero <= 10 && numero >= 0){
				if(numero % 2 == 0) {
					System.out.println("O n�mero � par e est� entre 0 e 10");
			}else if(numero % 2 != 0) {
				System.out.println("O n�mero � impar e est� entre 0 e 10");
				}
	}
		if(numero > 10 || numero < 0) {
			if(numero % 2 == 0) {
				System.out.println("O numero � par e n�o est� entre 0 e 10");
			}else if(numero % 2 != 0) { 
				System.out.println("O numero � �mpar e n�o est� entre 0 e 10");
			}
		}
		
		entrada.close();
	}
}
