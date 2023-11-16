package ExerciciosLacosRepetição;

import java.util.Scanner;

public class ExercicioLista2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int totalMenor21 = 0;
        int totalMaior50 = 0;

        
        System.out.println("Digite as idades das pessoas (digite uma idade negativa para encerrar):");

        int idade = scanner.nextInt();

        
        while (idade >= 0) {
            
            if (idade < 21) {
                totalMenor21++;
            } else if (idade > 50) {
                totalMaior50++;
            }

            
            System.out.print("Digite a próxima idade (digite uma idade negativa para encerrar): ");
            idade = scanner.nextInt();
        }

        
        System.out.println("Total de pessoas com menos de 21 anos: " + totalMenor21);
        System.out.println("Total de pessoas com mais de 50 anos: " + totalMaior50);

	}
	
}