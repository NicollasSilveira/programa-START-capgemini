package EstruturaCondicional;

public class Main {

	public static void main(String[] args) {
		
		float media = 7.0f;
		
		/* Operadores relacionais
		 *  > Maior
		 *  >= Maior ou igual
		 *  < Menor
		 *  <= Menor ou igual
		 *  == Igual
		 *  != Diferente
		 *  
		 *  Operadores logicos
		 *  
		 *  && E
		 *  || ou
		 *  ! Negação
		 */
		
		if(media >= 7) {
			//Aprovado
			
			if(media == 10){
				//Aprovado com nota maxima
			}
			
		} else {
			//Reprovado
			
		}
		
		Integer codProduto = 3;
		
		switch(codProduto) {
		
		case 1:
			
			// Camisa
			
			break;
			
		case 2:
			
			// Calça
			
			break;
			
		case 3:
			
			// Sapato
			
			break;
		
		default:
			// Fora do catalogo
		}
	}

}
