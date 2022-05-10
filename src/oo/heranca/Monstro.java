package oo.heranca;

public class Monstro extends Jogador {
	/*Monstro(){
		super(0, 0);
	}*/
	
	public Monstro(){
		this(0,0); // chama o construtor debaixo
	}
	
	public Monstro(int x, int y){
		super(x, y); // chama o construtor da classe pai
	}
}
