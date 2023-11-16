package ExericicioCollections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4_L2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        Set<Integer> integerSet = new HashSet<>();
	        integerSet.add(10);
	        integerSet.add(20);
	        integerSet.add(30);
	        integerSet.add(40);
	        integerSet.add(50);
	        integerSet.add(60);
	        integerSet.add(70);
	        integerSet.add(80);
	        integerSet.add(90);
	        integerSet.add(100);

	        boolean encontrado = false;

	        do {
	            System.out.print("Digite um número inteiro (ou '0' para finalizar): ");
	            int numero = scanner.nextInt();

	            if (numero == 0) {
	                System.out.println("Programa finalizado.");
	                break;
	            }

	            if (integerSet.contains(numero)) {
	                System.out.printf("Número %02d Encontrado!%n", numero);
	                encontrado = true;
	            } else {
	                System.out.printf("O número %02d não foi encontrado! Tente novamente.%n", numero);
	                encontrado = false;
	            }
	        } while (!encontrado);

	      
	}

}
