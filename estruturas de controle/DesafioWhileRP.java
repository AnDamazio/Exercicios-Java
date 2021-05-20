package controle;

import java.util.Scanner;

public class DesafioWhileRP {
	
	public static void main(String[] args) {
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		while(nota != -1) {
			System.out.println("Informe a nota: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			}
		}
		//Calcular a média
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
		entrada.close();
	}
}
