package oo.heranca.desafio;

public class Civic extends Carro {
	
	Civic(int velocidadeMaxima){
		super(velocidadeMaxima);
	}
	
	public void acelerar() {
		if(velocidadeAtual < VELOCIDADE_MAXIMA) {
			velocidadeAtual += 1000;
		}
	}
	
	public void frear() {
		if(velocidadeAtual >= 500) {
			velocidadeAtual -= 500;
		}else {
			velocidadeAtual = 0;
		}
		
	}
}
