package pa;

import java.util.Scanner;

public class Alunos10 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		for(int x = 1; x < 10; x++) {
			
			System.out.println("Digite o nome do aluno\n");
			String nome = entrada.next();
			System.out.printf("O nome do aluno é: %s\n", nome);
		}
			System.out.println("FIM");
		entrada.close();
	}
}

