package pa;

public class Funcionario {
	
	String funcao;
	double salario;
	
	public Funcionario(String funcao, double salario) {
		this.funcao = funcao;
		this.salario = salario;
	}	
		
		String exibirDados() {
			return String.format("%s %.2f", funcao, salario);
		}
}
