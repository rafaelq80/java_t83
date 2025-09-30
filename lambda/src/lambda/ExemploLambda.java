package lambda;

import java.util.Arrays;
import java.util.List;

public class ExemploLambda {
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("Exibir os itens\n");
		
		// Exibir os itens da Lista sem Expressão Lambda
		/*for(Integer n : numeros) {
			System.out.println(n);
		}*/

		numeros.forEach(numero -> System.out.println(numero));
			
		System.out.println("\nExibir os itens somados com eles mesmos\n");
		
		numeros.forEach(numero -> System.out.println(numero + numero));
		
		/*// Exibir os itens da Lista dobrados sem Expressão Lambda
		for(Integer n : numeros) {
			System.out.println(n + n);
		}*/

		System.out.println("\nExibir os itens pares da lista\n");
		
		numeros.forEach(numero -> {
			if(numero % 2 == 0)
				System.out.println(numero);
		});
		
		/*// Exibir apenas os elementos pares da Lista sem Expressão Lambda
		for(Integer n : numeros) {
			if(n%2 == 0)
			System.out.println(n);
		}*/
	}
}