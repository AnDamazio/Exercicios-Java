package fundamentos;

import java.util.Scanner;

public class QuadradoCubo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Digite um valor");
		Double n = entrada.nextDouble();
		entrada.close();
		
		System.out.printf("Ao quadrada ?: ",Math.pow(n, 2));
		System.out.printf("Ao cubo ?: ",Math.pow(n, 3));
	}
}
