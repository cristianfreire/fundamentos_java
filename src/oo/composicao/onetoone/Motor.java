package oo.composicao.onetoone;

public class Motor {
	
	Carro carro;
	boolean ligado = false;
	double fatorIngecao = 1;
	
	Motor(Carro carro){
		this.carro = carro;
	}
	
	int giros() {
		if(!ligado) {
			return 0;
		}else {			
			return (int ) Math.round(fatorIngecao * 3000) ;
		}
	}
}
