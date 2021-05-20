package pa;

public class Notas {
	
	String nome;
	double n1;
	double n2;
	double n3;
	double media;
	
	public Notas(String nome, double n1,
			double n2, double n3) {
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	Double calcularMedia() {
		media = (n1 + n2 + n3) / 3;
		return media;
	}
	
	String exibirDados() {
		
		return String.format("O aluno %s, com as notas: %.2f, %.2f, %.2f, tem media: %.2f",
				nome, n1, n2, n3, media);
	}
}

