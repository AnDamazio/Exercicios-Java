package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
	
		String i = "#";
		for(; !i.equals("######"); i+="#") {
			System.out.printf("%s \n", i);
		}
		//Versão do desafio
		//Não pode usar valor numérico para controlar o laço!
	}
}
