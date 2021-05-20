package fundamentos;

import java.util.Scanner;

public class Celsius {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor em Celsius");
		Double celso = entrada.nextDouble();
		
		entrada.close();
		
		Double resultado = (celso * 9) / 5 + 32;
		System.out.printf("%.2f em Fahrenheit é: %.2f", celso, resultado);
	}
}
