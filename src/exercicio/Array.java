package exercicio;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int qtdNotas;
		double soma = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de notas: ");
		qtdNotas = Integer.parseInt(scan.nextLine());
		
		
		double[] notas = new double[qtdNotas];
		
		for(int i=0; i<notas.length; i++) {
			System.out.printf("Informe a nota %d: ", i+1);
			notas[i] = Double.parseDouble(scan.nextLine());
		}
		
		for(double nota: notas) {
			soma += nota;
		}
		
		double media = soma/notas.length;
		
		System.out.println("\nMedia: " + media);
		
		
		scan.close();
	}
}
