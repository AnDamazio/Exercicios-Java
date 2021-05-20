package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		/*
		 * Domingo -> 1
		 * Segunda -> 2
		 * Terça ->  3
		 * Quarta -> 4
		 * Quinta -> 5
		 * Sexta -> 6
		 * Sábado -> 7
		 * */
		
		System.out.println("Digite um dia da semana");
		Scanner entrada = new Scanner(System.in);
		String x = entrada.next();
		
		if ("Domingo".equalsIgnoreCase(x)) {
			System.out.println("1");
		}else if ("Segunda".equalsIgnoreCase(x)) {
			System.out.println("2");
		}else if ("Terça".equalsIgnoreCase(x)) {
			System.out.println("3");
		}else if ("Quarta".equalsIgnoreCase(x)) {
			System.out.println("4");
		}else if ("Quinta".equalsIgnoreCase(x)) {
			System.out.println("5");
		}else if ("Sexta".equalsIgnoreCase(x)) {
			System.out.println("6");
		}else if ("Sábado".equalsIgnoreCase(x)
				|| "Sabado".equalsIgnoreCase(x)) {
			System.out.println("7");
		}else{
			System.out.println("Dia inválido.");
		}
		
		entrada.close();
	}
}
