package pa;

public class Professor {
	
	String RA;
	String formacao;
	String nome;

	public Professor(String RA, String formacao, String nome) {
		this.RA = RA;
		this.formacao = formacao;
		this.nome = nome;
	}
	
	String exibirDados() {
		return String.format("%s, %s, %s", RA, formacao, nome);
	}
}	
