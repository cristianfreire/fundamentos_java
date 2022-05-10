package exercicio;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida();
		//c1.nome = "Feijão";
		//c1.peso = 0.223;
		
		Comida c2 = new Comida();
		//c2.nome = "Arroz";
		//c2.peso = 0.300;
		
		Pessoa p = new Pessoa();
		//p.setNome("Cristian");
		//p.setPeso(81.0);
		//System.out.println("Peso atual: " + p.getPeso() + "Kg");
		
		//p.comer(c1);
		//p.comer(c2);
		
		
		//System.out.println("Peso após janta: " + p.getPeso() + "Kg");

		System.out.println(c2.equals(c1));
	}
}
