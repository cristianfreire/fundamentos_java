package exercicio;

public class Pessoa {
	String nome;
	double peso;
	
	public void comer(Comida c) {
		peso += c.peso;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPeso() {
		return peso;
	}

}
