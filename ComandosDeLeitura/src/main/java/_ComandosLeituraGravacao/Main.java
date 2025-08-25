package _ComandosLeituraGravacao;

import java.util.Scanner; // Importação do leitor de entradas

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Declaração do leitor
		
		System.out.println("Digite sua idade:");
		Integer age = input.nextInt(); // Le o proximo numero inteiro
		input.nextLine(); // Limpa a entrada para a proxima
		
		System.out.println("Digite seu nome:");
		String name = input.nextLine(); // Le a proxima entrada de texto
		
		System.out.println("Nome:"+ name + "\nIdade:" + age);
		
	}
}
