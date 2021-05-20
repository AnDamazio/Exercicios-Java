package pa;

public class PessoaMain {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Simone",
				"Silva", 23, "11111111111", "rua carambolas");
		
		Pessoa p2 = new Pessoa("André",
				"Damazio", 17, "22222222222", "rua samambaia");
		
		System.out.println(p1.exibirDados());
		System.out.println(p2.exibirDados());
		
	}
}
