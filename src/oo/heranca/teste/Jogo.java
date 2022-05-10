package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monstro heroi = new Monstro();
		heroi.x = 0;
		heroi.y = 0;
		
		//Jogador j2 = new Heroi();
		Heroi monstro = new Heroi(0,1);

		
		//j1.andar(Direcao.NORTE);
		// System.out.println(j1.x + " " + j1.y);

		System.out.println(heroi.vida);
		System.out.println(monstro.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println(heroi.vida);
		System.out.println(monstro.vida);
		
		

	}

}
