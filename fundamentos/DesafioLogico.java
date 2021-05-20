package fundamentos;

public class DesafioLogico {
	
	public static void main(String[] args) {
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		if (trabalho1 == true && trabalho2 == true) {
			System.out.println(
					"Comprar um televisor de 50 polegadas e tomar sorvete");
		}
		else if (trabalho1 == false && trabalho2 == true 
			|| trabalho1 == true && trabalho2 == false){
			System.out.println(
					"Comprar um televisor de 30 polegadas");
		}
		else{
			System.out.println(
					"Chorar no banho");
		}
		
		
	}
}
