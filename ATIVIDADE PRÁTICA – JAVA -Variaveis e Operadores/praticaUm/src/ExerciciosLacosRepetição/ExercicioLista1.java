package ExerciciosLacosRepetição;

import java.util.Scanner;

public class ExercicioLista1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	     System.out.print("Digite o primeiro número inteiro: ");
	     int primeiroNumero = scanner.nextInt();

	        System.out.print("Digite o segundo número inteiro (maior que o primeiro): ");
	        int segundoNumero = scanner.nextInt();

	        
	        if (primeiroNumero >= segundoNumero) {
	            System.out.println("Intervalo inválido. O primeiro número deve ser menor que o segundo.");
	            System.exit(0); 
	        }

	        
	        System.out.println("Múltiplos de 3 e 5 no intervalo de " + primeiroNumero + " a " + segundoNumero + ":");

	        for (int i = primeiroNumero; i <= segundoNumero; i++) {
	            if (i % 3 == 0 && i % 5 == 0) {
	                System.out.println(i);
	            }
	        }


	}

}
