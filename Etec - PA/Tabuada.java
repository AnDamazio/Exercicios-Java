package pa;

public class Tabuada {
	
	int numero;
	
	public Tabuada(int x) {
		this.numero = x;
	}
	
	void exibirTabuada() {
		int x = 0;
		do {
		System.out.printf("%d x %d = %d\n", numero, x, x*numero);
		x++;
		}while(x != 11);
	}
}
