package pa;

public class CodigoOrigem {
	
	String codigo;
	
	
	public CodigoOrigem(String codigo) {
		if(codigo.equals("1")) {
			this.codigo = "Sul";
		}else if(codigo.equals("2")) {
			this.codigo = "Norte";
		}else if(codigo.equals("3")) {
			this.codigo = "Leste";
		}else {
			this.codigo = "Oeste";
		}
	}
	
	String exibirDados() {
		return String.format("A região do objeto é: %s", codigo);
	}
}
