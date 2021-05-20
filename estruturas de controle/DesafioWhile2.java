package controle;

import java.util.Scanner;

public class DesafioWhile2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Double nota = 0.0;
		Double media = 0.0;
		Integer contador = 0;
		do {
		System.out.println("Digite uma nota");
		 nota = entrada.nextDouble();
		 	if(nota > 10 || nota <-1){
		 		System.out.println("Digite uma nota válida!");
		 		nota = 0.0;
		 		contador -= 1;
		 	}
		 	media += nota;
		 	contador ++;
		} while(nota != (-1));
			contador -= 1;
			media += 1;
			System.out.printf("A média dos %d alunos é: %f", contador, media / contador);
		
		entrada.close();
	}
}
