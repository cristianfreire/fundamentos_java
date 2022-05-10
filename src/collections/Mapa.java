package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(1, "Cristian");  // se colocar a mesma chave ele substitui
		usuarios.put(2, "Renan");  
		
		// mostra as chaves
		System.out.println(usuarios.keySet());
		
		// mostra valores
		System.out.println(usuarios.values());
		
		// chave valor
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(1));
		System.out.println(usuarios.containsValue("Cris"));
		
		System.out.println(usuarios.get(2));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey());
			System.out.println(registro.getValue());
		}
		
	}

}
