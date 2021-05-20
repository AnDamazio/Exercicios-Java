package fundamentos;

public class DesafioLogicoRP {
	//Trabalho de terça (V ou F)
	//Trabalho de quinta (V ou F)
	
	public static void main(String[] args) {
		
	boolean trabalho1 = true;
	boolean trabalho2 = false;
	
	boolean comprouTv50 = trabalho1 && trabalho2;
	boolean comprouTv32 = trabalho1 ^ trabalho2;
	boolean comprouSorvete = trabalho1 || trabalho2;
	
	System.out.println(comprouTv50);
	System.out.println(comprouTv32);
	
	//Operador Unário!
	System.out.println("Mais saudável? " + !comprouSorvete);
	

	}
}
