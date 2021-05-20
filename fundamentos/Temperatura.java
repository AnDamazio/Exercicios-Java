package fundamentos;

public class Temperatura {
	
	public static void main(String[] args){
		
		// (ºF - 32) x 5/9 = ºC
		
		final double f = 32;
		final double ajuste = 5.0/9.0;
		double farinho = 86;
		double resultado = (farinho - f) * ajuste;
		System.out.println("O resultado é: " + resultado);
		
	}
}
