package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;

public class CarroMain {
	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari(400);
		ferrari.ligarAr();
		ferrari.ligarTurbo();
		ferrari.desligarAr();
		
		System.out.println(ferrari.velocidadeDoAr());
		
		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);
	}
}
