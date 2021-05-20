package fundamentos;

import javax.swing.JOptionPane;

public class DesafioConversao {

	public static void main(String[] args) {
		
		String s1 = JOptionPane.showInputDialog
				("Digite o primeiro salário");
		
		String s2 = JOptionPane.showInputDialog
				("Digite o segundo salário");
		
		String s3 = JOptionPane.showInputDialog
				("Digite o terceiro salário");
		
		double numero1 = Double.parseDouble(s1.replace(',', '.'));
		double numero2 = Double.parseDouble(s2.replace(',', '.'));
		double numero3 = Double.parseDouble(s3.replace(',', '.'));
		
		double media = (numero1 + numero2 + numero3) / 2.0;
		
		System.out.println(media);
	}
}
