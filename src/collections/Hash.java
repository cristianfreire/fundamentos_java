package collections;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		HashSet<Usuario> usuarios =  new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Cristian"));
		usuarios.add(new Usuario("Renan"));
		usuarios.add(new Usuario("Ana"));
		
		System.out.println(usuarios.contains(new Usuario("Cristian")));
		
	}

}
