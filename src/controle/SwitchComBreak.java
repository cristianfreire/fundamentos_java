package controle;

public class SwitchComBreak {
	public static void main(String[] args) {
		String conceito = "";
		int nota = 9;

		switch (nota) {
		case 10:
		case 9:
			conceito = "A";
			break;
		}

		System.out.println("Conceito é: " + conceito);
	}
}
