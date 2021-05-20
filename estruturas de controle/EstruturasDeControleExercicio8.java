package controle;

import java.util.Scanner;

public class EstruturasDeControleExercicio8 {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite uma palavra");
			String palavra = entrada.next();
			int contador = 0;
			do{
				System.out.println(palavra.charAt(contador));
				contador++;
			}while(contador != palavra.length());
			entrada.close();
		}
}
