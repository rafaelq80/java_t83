package operadores;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		// Instanciar um objeto da Classe Scanner (Entrada de dados)
		
		Scanner leia = new Scanner(System.in);
		
		// Definir as variáveis
		
		double numero1, numero2;

		// Entrada de dados
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextDouble();
		
		// Efetuar os cálculos
		
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, numero1 + numero2);
		System.out.printf("%.2f - %.2f = %.2f%n", numero1, numero2, numero1 - numero2);
		System.out.printf("%.2f * %.2f = %.2f%n", numero1, numero2, numero1 * numero2);
		System.out.printf("%.2f / %.2f = %.2f%n", numero1, numero2, numero1 / numero2);
		
		// Operações Matemáticas com a Biblioteca Math
		System.out.printf("%.2f ^ %.2f = %.2f%n", numero1, numero2, Math.pow(numero1, numero2));
		System.out.printf("Raiz Quadrada de %.2f = %.2f", numero1, Math.sqrt(numero1));
		
		leia.close();
	}

}
