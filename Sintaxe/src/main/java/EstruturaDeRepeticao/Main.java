package EstruturaDeRepeticao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("****************\n");
		
		Integer qtdPaes = 20;
		
		while(qtdPaes > 0){
			System.out.println("Quantos pães quer pegar? temos:" + qtdPaes);
			Integer paesPegos = input.nextInt();
			  
			  qtdPaes = qtdPaes - paesPegos;
		}
	}

}
