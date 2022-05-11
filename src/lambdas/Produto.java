package lambdas;

//public class Produto {
public class Produto extends Object{
	final String nome;
	final double preco;
	final double desconto;
	
			
	public Produto(String nome, double preco, double desconto) {
		//super(); n precisa
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	@Override
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		String prod = nome + " R$" + precoFinal;
		return prod;
	}
}
