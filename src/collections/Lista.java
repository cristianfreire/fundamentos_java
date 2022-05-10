package collections;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Cristian");
		lista.add(u1);
		lista.add(new Usuario("Renan"));
		
		System.out.println(lista.get(0)); // acessar pelo indice
		
		lista.remove(1);
		System.out.println(lista.remove(new Usuario("Manu")));
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
	}
}
