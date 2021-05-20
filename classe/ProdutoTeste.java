package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		
		Produto p1 = new Produto("Notebook", 4356.89);
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.25;
		
		double precofinal = p1.precoComDesconto();
		System.out.printf("O preço final é: R$ %.2f", precofinal);
	}
}