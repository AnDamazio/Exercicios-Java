package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		if (media >=7) {
			System.out.println("Aluno aprovado");
		}
		else {
			System.out.println("Aluno reprovado");
		}
		entrada.close();
	}
}
