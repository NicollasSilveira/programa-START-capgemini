package _ClassesPOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Pessoa objPessoa = new Pessoa(70.00f, 1.70f); // Com valor default
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa");
		objPessoa.nome = input.nextLine();
		
		System.out.println("Digite o peso da pessoa");
		objPessoa.setPeso(input.nextFloat());
		
		System.out.println("Digite a altura da pessoa");
		objPessoa.setAltura(input.nextFloat());
		
		System.out.println("O imc de:" + objPessoa.nome + " é: " + objPessoa.calcularIMC());
		
	}

}
