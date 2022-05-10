package oo.composicao.oneton;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "Cristian";
		c1.adicionarItem("Caneta", 20, 7.45);
		c1.adicionarItem(new Item("Borracha", 12, 3.89));
		c1.adicionarItem(new Item("Caderno", 3, 18.79));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.valorTotal());
		
		// Rela��o bidirecional
		double total = c1.itens.get(0).compra.itens.get(0).compra.valorTotal();
		System.out.println("O total �: R$" + total);
	}
}
