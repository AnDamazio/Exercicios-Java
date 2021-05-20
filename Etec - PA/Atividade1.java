package pa;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Declara variável
		Double n1 = 0.;
		
		/*
		* Verifica resto da divisão;
		* Identifica se é par ou impar;
		* Encerra se n1 = -1
		* */
		do {
			System.out.println("Digite um número");
			n1 = entrada.nextDouble();
			System.out.println("*****************");
			if (n1 % 2 == 0) {
				System.out.println("O número é par!");
				System.out.println("*****************");
			}else if(n1 % 2 != 0 && n1 != -1) {
				System.out.println("O número é ímpar!");
				System.out.println("*****************");
			}
		}while(n1 != -1);//Encerra o programa caso entrada = -1
		System.out.println("Fim");
		entrada.close();
	}
}
