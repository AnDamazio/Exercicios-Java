package fundamentos;

public class DesafiosAritmeticos {

	public static void main(String[] args) {
		
		int a = 6*(3+2);
		a = (int) Math.pow(a, 2) / (3*2);
				
		int b = (1-5) * (2-7) / 2;
		b = (int)Math.pow(b, 2);
		
		int r = a - b; 
		int d = 10;
		d = (int)Math.pow(d, 3);
		
		r = (int)Math.pow(r, 3) / d;
		System.out.println(r);
	}
}
