package exercicios;

import java.util.Scanner;

public class AtividadeUm {

	public static void main(String[] args) {
		
		float salario,abono,novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o salario: ");
		salario = leia.nextFloat();
		System.out.println("\nEntre com o abono: ");
		abono = leia.nextFloat();
		
		
		novoSalario = salario + abono;
		System.out.println("\n O seu novo salario é: "+novoSalario);

		

	}

}
