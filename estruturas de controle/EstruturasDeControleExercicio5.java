package controle;

import java.util.Random;
import java.util.Scanner;

public class EstruturasDeControleExercicio5 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		Scanner entrada = new Scanner(System.in);
		Integer segredo = random.nextInt(100);
		Integer contador = 10;
		
		do {
			System.out.println("Digite um número");
			Integer numero = entrada.nextInt();
			contador -= 1;
		if (numero == segredo){
			System.out.println("Parabéns! Você acertou");
			contador -=contador;
		}else {
			System.out.println("Você errou!");
			System.out.printf("%d tentativas restante(s)",contador);
		}
		
		}while(!contador.equals(0));
		entrada.close();
	}
}
