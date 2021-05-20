package pa;

public class indiceMassa {
	
	String nome;
	String sexo;
	double altura;
	double imc;
	
	public indiceMassa(String nome,
			String sexo, double altura) {
		this.nome = nome;
		this.sexo = sexo;
		this.altura = altura;
	}
	
	void calcularIMC() {
		if (sexo.equalsIgnoreCase("Masculino")) {
			imc = (72.7 * altura) - 58;
		}else {
			imc = (72.7 * altura) - 44.7;
		}
	}
	
	String exibirDados() {
		return String.format("Nome: %s\nSexo: %s\nAltura: %.2f\n"
				+ "IMC: %.2f", nome, sexo, altura, imc);
	}
}
