package oo.composicao.desafio;

public class ClientTeste {
	public static void main(String[] args) {
		
		Cliente cliente1 =  new Cliente("Cristian");
		
		Item item1 = new Item(2, 1.5, "Caneta");
		Item item3 = new Item(1, 1, "Lápis");
		Item item4 = new Item(1, 1, "Apontador");
		
		cliente1.comprar(item4);
		cliente1.comprar(item3);
		cliente1.comprar(item1);
		
		cliente1.compra.itensComprados();
		cliente1.compra.obterValorTotal();
		
		
	}
}
