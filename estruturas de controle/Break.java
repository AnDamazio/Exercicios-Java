package controle;

public class Break {

	public static void main(String[] args) {
		
		for (int i = 0; i < 230; i++) {
			
			System.out.println(i);
			if(i == 173) {
				break;
			}
		}
		
		System.out.println("Fim!");
	}
}
