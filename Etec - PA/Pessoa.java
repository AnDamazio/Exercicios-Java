package pa;

public class Pessoa {
	
	String nome;
	String sobrenome;
	int idade;
	String CPF;
	String endereco;
	
	public Pessoa(String nome, String sobrenome, int idade,
			String CPF, String endereco) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.CPF = CPF;
		this.endereco = endereco;
	}
	
	String exibirDados() {
		
		return String.format("NOME: %s\nSOBRENOME: %s\nIDADE: %d\nCPF: %s\nENDEREÇO: %s\n", nome, sobrenome, idade, CPF, endereco);
	}
}

	
