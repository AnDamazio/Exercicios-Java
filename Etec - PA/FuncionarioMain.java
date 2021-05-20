package pa;

public class FuncionarioMain {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Desenvolvedor Junior", 2450.20);
		Funcionario f2 = new Funcionario("Desenvolvedor Sênior", 9500.00);
	
		System.out.println(f1.exibirDados());
		System.out.println(f2.exibirDados());
	}
}
