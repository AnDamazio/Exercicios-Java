package controle;

import java.util.Scanner;

public class EstruturasDeControleExercicio3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira nota:");
		Double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		Double nota2 = entrada.nextDouble();
		
		Double media = nota1 + nota2 / 2;
		if (media >= 7) {
			System.out.println("Aprovado");
		}else if(media <7 && media >= 4) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}
		
		entrada.close();
		
	}
}
