package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elemento na fila
		// Diferen�a de comportamento ocorre
		// quando a fila est� cheia!
		fila.add("Cristian"); // retorna false
		fila.offer("Bia"); // Lan�a uma exception
		fila.add("Carlos");
		fila.offer("Walter");
		fila.add("Jo�o");
		
		// Peek e Element -> ober o pr�ximo elemento da fila (sem remover)
		// Diferen�a � o comportamento ocorre
		// quando a fila est� vazia!
		System.out.println(fila.peek());  // retorna null
		System.out.println(fila.element());  // Lun�a uma exception
		
		// fila.size(); tamanho
		// fila.clear(); limpar
		// fila.isEmpty(); // verificar se est� vazia
		// fila.contains(...); // verifia se elemento est� na fila
		
		// remove o primeiro elemento e retorna null se estiver vazia
		System.out.println(fila.poll());
		// faz o mesmo que pool, mas lan�a uma exception se a fila estiver vazia;
		System.out.println(fila.remove());
	}
}
