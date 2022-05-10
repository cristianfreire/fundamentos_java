package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	final List<Compra> compras = new ArrayList<Compra>();
	Compra compra;

	Cliente(String nome){
		this.nome = nome;
		this.compra = new Compra(this);
	}

	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	void comprar(Item item) {
		compra.adicionarItem(item);
	}
}
