package classe;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Ricardo",170.0);
		Pessoa p2 = new Pessoa("Stephany", 35);
		
		Comida c1 = new Comida("Bolo", 0.3);
		Comida c2 = new Comida("Azeitona", 0.01);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		
		System.out.println(p2.apresentar());
		p2.comer(c2);
		System.out.println(p2.apresentar());
	}

}
