package fundamentos;


public class TiposPrimitivos {
	public static void main(String[] args) {
		
		// inteiro
		long pontos = 3_1_845_223L;
		System.out.println("Pontos: " + pontos);

		// real
		float salario = 11_445.44F;
		System.out.println("Salario: R$ " + salario);
		
		double vendas = 2_991_797_103.01;
		//Com notação cientifica -> System.out.println("Vendas: " + vendas);
		System.out.printf("Vendas: R$ %.2f\n",vendas);
		//System.out.println("\nMaior Double: " + Double.MAX_VALUE);
		
		// bool
		boolean ferias = false;
		System.out.println("Ferias: " + ferias);
		
		// char
		char status = '\u0041';
		System.out.println("Status: " + status);
	}
}
