package oo.composicao.onetoone;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.motor.giros());
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		 
		// Faltou encapsulamento!!!
		//c1.motor.fatorIngecao = -30;
		
		System.out.println(c1.motor.giros());
		
		// Rela��o bidirecional
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
	}

}
