package controle;

public class Break {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 5) {
					System.out.println("[" + i + " " + j + "]");
					break;
				}
			}
		}

		System.out.println("Fim!");
	}
}
