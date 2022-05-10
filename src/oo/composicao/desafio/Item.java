package oo.composicao.desafio;

public class Item {
	
	int quantidade;
	Produto produto;
	
	Item(int quantidade, double preco, String nome){
		this.quantidade = quantidade;
		this.produto = new Produto(nome, preco);
	}
	
	
	
}
