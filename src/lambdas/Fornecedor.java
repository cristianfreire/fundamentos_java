package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {
		Supplier<Object> umaLista2 = () -> Arrays.asList("Ana", "Bia", "Gui", "Lia");
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Gui", "Lia");

		System.out.println(umaLista.get());
		System.out.println(umaLista2.get());
	}
}
