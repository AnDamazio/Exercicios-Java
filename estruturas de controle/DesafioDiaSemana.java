package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		/*
		 * Domingo -> 1
		 * Segunda -> 2
		 * Ter�a ->  3
		 * Quarta -> 4
		 * Quinta -> 5
		 * Sexta -> 6
		 * S�bado -> 7
		 * */
		
		System.out.println("Digite um dia da semana");
		Scanner entrada = new Scanner(System.in);
		String x = entrada.next();
		
		if ("Domingo".equalsIgnoreCase(x)) {
			System.out.println("1");
		}else if ("Segunda".equalsIgnoreCase(x)) {
			System.out.println("2");
		}else if ("Ter�a".equalsIgnoreCase(x)) {
			System.out.println("3");
		}else if ("Quarta".equalsIgnoreCase(x)) {
			System.out.println("4");
		}else if ("Quinta".equalsIgnoreCase(x)) {
			System.out.println("5");
		}else if ("Sexta".equalsIgnoreCase(x)) {
			System.out.println("6");
		}else if ("S�bado".equalsIgnoreCase(x)
				|| "Sabado".equalsIgnoreCase(x)) {
			System.out.println("7");
		}else{
			System.out.println("Dia inv�lido.");
		}
		
		entrada.close();
	}
}
