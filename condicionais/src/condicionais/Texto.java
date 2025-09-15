package condicionais;

import java.util.Scanner;

public class Texto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		String texto;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		System.out.println("Digite uma String: ");
		leia.skip("\\R");
		texto = leia.nextLine();
		
		System.out.println("A String digitada foi: " + texto);
		
		leia.close();
	}

}
