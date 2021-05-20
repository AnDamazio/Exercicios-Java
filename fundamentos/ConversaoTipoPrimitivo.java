package fundamentos;

public class ConversaoTipoPrimitivo {
	
	public static void main(String[] args) {
		
		double a = 1; // impl�cita
		System.out.println(a);
		
		
		float b = (float) 1.12345; // expl�cita (CAST)
		System.out.println(b);
		
		int c = 5;
		byte d = (byte) c; // expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; // expl�cita (CAST)
		System.out.println(f);
	}
}