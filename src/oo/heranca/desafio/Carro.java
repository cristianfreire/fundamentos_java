package oo.heranca.desafio;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	private int power = 100;

	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidadeAtual + getPower() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual += getPower();
		}

	}

	public void frear() {
		if (velocidadeAtual >= getPower()) {
			velocidadeAtual -= 5;
		}else {
			velocidadeAtual = 0;
		}
	}

	@Override
	public String toString() {
			return "Estado do carro = " + velocidadeAtual + "KM/h ";
	
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	
}
