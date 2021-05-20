package pa;

public class ProfessorMain {

	public static void main(String[] args) {
		
		Professor p1 = new Professor("1199802", "Desenvolvedora", "Simone");
		Professor p2 = new Professor("1199801", "Desenvolvedor", "Cristiano");
		System.out.println(p1.exibirDados());
		System.out.println(p2.exibirDados());
	}
}
