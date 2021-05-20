package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.printf("Salário: %.1f%n", 1234.5678);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade ");
		int idade = entrada.nextInt();
		
		System.out.printf("%nNome = %s %s" + 
		"%nIdade = %d",nome, sobrenome, idade);
		
		entrada.close();
	}
}
