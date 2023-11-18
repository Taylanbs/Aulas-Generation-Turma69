package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class Exercicio2Lista1 {
	public static void main(String[] args) {
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
						
		if(numero % 2 ==0 && numero >0) {
			System.out.println("\nO numero "+numero+" é par e positivo" );
			
		}else if(numero % 2 ==0 && numero < 0){
			System.out.println("\nO numero "+numero+" é par e negativo" );
		
		}else if(numero % 2 == 1 && numero > 0){
			System.out.println("\nO numero "+numero+" é impar e positivo" );
		
		}else {
			System.out.println("\nO numero "+numero+" é impar e negativo" );

		}
	
	

		
		
	}
}

	