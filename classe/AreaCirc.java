package classe;

public class AreaCirc {
	
	double raio;
	static final double pi = 3.14;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	Double area() {
		return pi * Math.pow(raio, 2);
	}
}
