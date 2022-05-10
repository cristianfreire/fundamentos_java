package oo.composicao.desafio.resp;

public class Sistema {

	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 2.0, 2);
		compra1.adicionarItem(new Produto("Notebook", 3999.99), 1);
		
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 9.0, 2);
		compra2.adicionarItem(new Produto("Impressora", 2999.99), 1);
	
		Cliente cliente1 = new Cliente("Cristian Passos");
		cliente1.compras.add(compra2);
		
		Cliente cliente2 = new Cliente("Renan Passos");
		cliente2.adicionarCompra(compra1);
		
		
		System.out.println(cliente1.obterValorTotal());		
		System.out.println(cliente2.obterValorTotal());		
	
	}

}
