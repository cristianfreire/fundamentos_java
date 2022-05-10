package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elemento na fila
		// Diferença de comportamento ocorre
		// quando a fila está cheia!
		fila.add("Cristian"); // retorna false
		fila.offer("Bia"); // Lança uma exception
		fila.add("Carlos");
		fila.offer("Walter");
		fila.add("João");
		
		// Peek e Element -> ober o próximo elemento da fila (sem remover)
		// Diferença é o comportamento ocorre
		// quando a fila está vazia!
		System.out.println(fila.peek());  // retorna null
		System.out.println(fila.element());  // Lunça uma exception
		
		// fila.size(); tamanho
		// fila.clear(); limpar
		// fila.isEmpty(); // verificar se está vazia
		// fila.contains(...); // verifia se elemento está na fila
		
		// remove o primeiro elemento e retorna null se estiver vazia
		System.out.println(fila.poll());
		// faz o mesmo que pool, mas lança uma exception se a fila estiver vazia;
		System.out.println(fila.remove());
	}
}
