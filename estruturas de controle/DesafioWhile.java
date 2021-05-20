package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		Integer contagem = 1;
		Double media = 0.0;
		Integer alunosP = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sala?");
		Integer alunos = entrada.nextInt();
		alunosP = alunos;
		
	
		
		do{
			System.out.printf("Qual a nota do aluno %d?", (alunos - alunos) + contagem);
			Double notaI = entrada.nextDouble();
			if(notaI > 10 || notaI < 0) {
				System.out.println("Digite uma nota válida, por favor!");
				alunos += 1;
				contagem -= 1;
				notaI = 0.0;
			}
			alunos -= 1;
			contagem += 1;
			media += notaI;
		} while(!alunos.equals(0));
		
		System.out.printf("A média dos alunos é: %.2f ", media / alunosP);
		entrada.close();
	}
}
