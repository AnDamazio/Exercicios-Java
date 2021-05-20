package classe;

import java.util.Scanner;

public class Desafio1 {
	Scanner entrada = new Scanner(System.in);
	
	String dia;
	String mes;
	String ano;
	
	Desafio1() {
		System.out.println("Digite um dia");
		dia = entrada.nextLine();
		
		System.out.println("Digite um mes");
		mes = entrada.nextLine();
		
		System.out.println("Digite um ano");
		ano = entrada.nextLine();
		if(dia.equals("")) {
			dia = "1";
		}if(mes.equals("")) {
			mes = "1";
		}if(ano.equals("")) {
			ano = "1970";
		}
		
	}
	Desafio1(String dia2, String mes2, String ano2) {
		
		System.out.println("Digite um dia");
		dia2 = entrada.nextLine();
		
		System.out.println("Digite um mes");
		mes2 = entrada.nextLine();
		
		System.out.println("Digite um ano");
		ano2 = entrada.nextLine();
		
		dia = dia2;
		mes = mes2;
		ano = ano2;
		entrada.close();

	}
	
	
	String obterData() {
		return String.format("%s/%s/%s", dia, mes, ano);
	}
}
