package fundamentos;

import javax.swing.JOptionPane;

public class DesafioConversao {
	public static void main(String[] args) {
		String v1 = JOptionPane.showInputDialog("Digite o primeiro salario: ");
		String v2 = JOptionPane.showInputDialog("Digite o segundo salario: ");
		String v3 = JOptionPane.showInputDialog("Digite o terceiro salario: ");
		
		v1 = v1.replace(",", ".");
		v2 = v2.replace(",", ".");
		v3 = v3.replace(",", ".");
		
		double soma = (
				Double.parseDouble(v1) + 
				Double.parseDouble(v2) + 
				Double.parseDouble(v3));
		
		System.out.println("Soma: " + soma);
		System.out.printf("Media: %.2f", (soma / 3));
		
		
		
		
		
	}
}
