package fundamentos;

import java.util.Scanner;

public class IMC {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual é o seu peso?");
		Double peso = entrada.nextDouble();
		
		System.out.println("Qual é a sua altura?");
		Double altura = entrada.nextDouble();
		
		entrada.close();
		
		System.out.println(peso / (altura * altura));
	}
}
