package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
	
		String i = "#";
		for(; !i.equals("######"); i+="#") {
			System.out.printf("%s \n", i);
		}
		//Vers�o do desafio
		//N�o pode usar valor num�rico para controlar o la�o!
	}
}
