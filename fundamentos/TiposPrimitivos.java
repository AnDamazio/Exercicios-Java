package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionário
		
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
	System.out.println("Anos de empresa: " + anosDeEmpresa);
	System.out.println("Número de voos: " + numeroDeVoos);
	System.out.println("ID do usuário: " + id);
	System.out.println("Pontos acumulados: " + pontosAcumulados);
		
		//Tipos numéricos reais
		float salario = 1.44f;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println("Anos de empresa: " + anosDeEmpresa * 365);
	
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
