package fundamentos;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 4.6;
		String resultadoFinal = media >= 7.0 ? 
				"Aprovado." : "em recupera��o";
	
		System.out.println("O aluno est� " + resultadoFinal);
	}
}
