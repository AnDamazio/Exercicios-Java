package pa;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Declara vari�vel
		Double n1 = 0.;
		
		/*
		* Verifica resto da divis�o;
		* Identifica se � par ou impar;
		* Encerra se n1 = -1
		* */
		do {
			System.out.println("Digite um n�mero");
			n1 = entrada.nextDouble();
			System.out.println("*****************");
			if (n1 % 2 == 0) {
				System.out.println("O n�mero � par!");
				System.out.println("*****************");
			}else if(n1 % 2 != 0 && n1 != -1) {
				System.out.println("O n�mero � �mpar!");
				System.out.println("*****************");
			}
		}while(n1 != -1);//Encerra o programa caso entrada = -1
		System.out.println("Fim");
		entrada.close();
	}
}
