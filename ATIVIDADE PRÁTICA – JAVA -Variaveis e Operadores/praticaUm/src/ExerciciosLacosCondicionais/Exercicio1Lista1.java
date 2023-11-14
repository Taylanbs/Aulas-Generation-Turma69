package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class Exercicio1Lista1 {

	public static void main(String[] args) {
		
		int A, B,C;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor para A: ");
		A = leia.nextInt();
		
		System.out.println("Defina um valor para B: ");
		B = leia.nextInt();
		
		System.out.println("Defina um valor para C: ");
		C = leia.nextInt();
		
		if(A+B>C) {
			System.out.println("\nA soma de A + B é maior do que C");
			
		}else if(A+B<C){
			System.out.println("\nA soma de A + B é menor do que C" );
		
		}else {
			System.out.println("\nA + B = C" );
		}	


	}

}
