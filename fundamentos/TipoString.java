package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Carambolas".charAt(4));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println(s.length());
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " 
		+ sobrenome + "\nIdade: " + idade + "\nSalário: " + salario +
		"\n\n");
		
		System.out.printf("Nome: %s %s tem %d anos e ganah R$%.2f.\n", nome, sobrenome, 
				idade, salario);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
	}
}
