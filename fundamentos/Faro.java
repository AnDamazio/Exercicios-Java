package fundamentos;

import java.util.Scanner;

public class Faro {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor em Fahrenheit");
		Double faro = entrada.nextDouble();
		
		entrada.close();
		
		Double graus = (faro - 32) * 5 / 9;
		System.out.printf("%.2f°F em graus é: %.2f°C", faro, graus);
	}
}
