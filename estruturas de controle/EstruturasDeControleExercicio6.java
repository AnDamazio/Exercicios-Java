package controle;

import java.util.Scanner;

public class EstruturasDeControleExercicio6 {
	
	public static void main(String[] args) {
		
		Double n = 0.0;
		Double total = 0.0;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Escreva um número");
			n = entrada.nextDouble();
			total += n;
			System.out.printf("A soma dos números é: %f\n", total);
		}while(n >= 0);
			System.out.println("Deu mole pra caralho");
		
		entrada.close();
	}
}
