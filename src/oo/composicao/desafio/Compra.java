package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final Cliente cliente;
	final List<Item> itens = new ArrayList<>();
	double valorTotal;
	
	Compra(Cliente cliente){
		this.cliente = cliente;
	}

	void adicionarItem(Item item) {
		this.itens.add(item);
	}
	
	void itensComprados() {
		for(int i = 0; i < itens.size(); i++) {
			System.out.println(itens.get(i).quantidade + " " + itens.get(i).produto.nome  );
		}
	}
	
	void obterValorTotal() {
		for(int i=0; i<itens.size(); i++) {
			valorTotal += (itens.get(i).quantidade * itens.get(i).produto.preco);
		}
		System.out.println("O valor total é: R$" + valorTotal);
	}
	
	
	
	
	
}
