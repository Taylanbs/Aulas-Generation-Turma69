package exercicios;

import java.util.Scanner;

public class AtividadeQuatro {

	public static void main(String[] args) {
			float numero1, numero2, numero3, numero4,diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número 1: ");
		numero1 = leia.nextFloat();
		
		System.out.println("\nDigite o número 2: ");
		numero2 = leia.nextFloat();
		
		System.out.println("\nDigite o número 3 : ");
		numero3 = leia.nextFloat();
		
		System.out.println("\nDigite o número 4 : ");
		numero4 = leia.nextFloat();
		
		diferenca = (numero1 * numero2) - (numero3 * numero4);
		System.out.println("\nO resultado da diferença entre os produtos é : "+diferenca);


	}

}
