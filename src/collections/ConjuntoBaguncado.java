package collections;

import java.util.HashSet;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet(); // n�o aceita repeti��o e n�o tem indice
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove(1));
	}
}
