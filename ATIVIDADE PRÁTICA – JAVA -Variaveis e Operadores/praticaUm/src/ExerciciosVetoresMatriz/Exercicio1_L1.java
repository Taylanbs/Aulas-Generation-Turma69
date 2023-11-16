package ExerciciosVetoresMatriz;

import java.util.Scanner;

public class Exercicio1_L1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int[] vetor = {4, 8, 2, 1, 7, 5, 10, 3, 9, 6};

        boolean continuarPesquisa = true;

        while (continuarPesquisa) {
            System.out.print("Digite um número para pesquisar no vetor: ");
            int numeroPesquisado = scanner.nextInt();

            int posicao = pesquisarNumero(vetor, numeroPesquisado);

            if (posicao != -1) {
                System.out.println("O número " + numeroPesquisado + " foi encontrado na posição " + posicao + " do vetor.");
            } else {
                System.out.println("Não foi encontrado!");

                System.out.print("Deseja tentar novamente? (S para Sim / N para Não): ");
                char resposta = scanner.next().charAt(0);

                if (resposta != 'S' && resposta != 's') {
                    continuarPesquisa = false;
                }
            }
        }

        System.out.println("Programa finalizado.");
    }

    public static int pesquisarNumero(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return i; 
            }
        }
        return -1; 
    }
}
