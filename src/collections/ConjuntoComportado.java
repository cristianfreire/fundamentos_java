package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		// Set<String> lista = new HashSet<String>();
		//Set<String> lista = new TreeSet<String>(); // mantém a ordem de insercao
		SortedSet<String> lista = new TreeSet<String>(); // mantém a ordem de insercao
		lista.add("Cristian");
		lista.add("Renan");
		
		for(String nomes: lista) {
			System.out.println(nomes);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		for(int numeros: nums) {
			System.out.println(numeros);
		}

	}
}
