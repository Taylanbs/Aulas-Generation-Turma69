package ExericicioCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicicio1_L1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        ArrayList<String> coresArrayList = new ArrayList<>();

        System.out.println("Digite 5 cores:");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Cor %d: ", i + 1);
            String cor = scanner.nextLine();
            coresArrayList.add(cor);
        }

        System.out.println("\nCores adicionadas:");
        for (String cor : coresArrayList) {
            System.out.println(cor);
        }

        Collections.sort(coresArrayList);
        System.out.println("\nCores ordenadas em ordem crescente:");
        for (String cor : coresArrayList) {
            System.out.println(cor);
        }

      
	}

}
