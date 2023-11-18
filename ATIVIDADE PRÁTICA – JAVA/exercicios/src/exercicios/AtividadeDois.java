package exercicios;

import java.util.Scanner;

public class AtividadeDois {

	public static void main(String[] args) {
		
		float nota1,nota2,nota3,nota4,mediaFinal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a nota 3: ");
		nota3 = leia.nextFloat();
		System.out.println("\nEntre com a nota 4: ");
		nota4 = leia.nextFloat();
		
		mediaFinal = (nota1+nota2+nota3+nota4)/4;
		System.out.printf("\nA média final é: %.1f " , +mediaFinal);

		
		
		


	}

}
