package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		// + - * / %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		double n1 = entrada.nextDouble();
		
		System.out.println("Digite um n�mero");
		double n2 = entrada.nextDouble();
		
		System.out.println("Escolha a opera��o, Digite:\n"
				+ "*   para multiplicar os n�meros\n"
				+ "-   para subtrair os n�meros\n"
				+ "+   para somar os n�meros\n"
				+ "/   para dividi-los\n"
				+ "%   para o resto da divis�o\n");
		
		String calculo = entrada.next();
		
		
		double resultado = "+".equals(calculo) ? n1 + n2 : 0;
			resultado = "*".equals(calculo) ? n1 * n2 : resultado;
			resultado = "-".equals(calculo) ? n1 - n2 : resultado;
			resultado = "/".equals(calculo) ? n1 / n2 : resultado;
			resultado = "%".equals(calculo)? n1 % n2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %f", n1, calculo, n2, resultado);
		entrada.close();
	}
}
