package ExercicioEstruturaDados;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Stack<String> pilhaLivros = new Stack<>();

        int opcao;
        do {
            exibirMenu();
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarLivro(pilhaLivros, scanner);
                    break;
                case 2:
                    listarLivros(pilhaLivros);
                    break;
                case 3:
                    retirarLivro(pilhaLivros);
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1: Adicionar Livro na Pilha");
        System.out.println("2: Listar Livros na Pilha");
        System.out.println("3: Retirar Livro da Pilha");
        System.out.println("0: Sair do Programa");
    }

    private static void adicionarLivro(Stack<String> pilhaLivros, Scanner scanner) {
        System.out.print("Digite o nome do Livro: ");
        String nomeLivro = scanner.nextLine();
        pilhaLivros.push(nomeLivro);
        System.out.println("Livro adicionado na pilha.");
    }

    private static void listarLivros(Stack<String> pilhaLivros) {
        if (pilhaLivros.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("Livros na pilha (do topo para o fundo):");
            for (String livro : pilhaLivros) {
                System.out.println(livro);
            }
        }
    }

    private static void retirarLivro(Stack<String> pilhaLivros) {
        if (pilhaLivros.isEmpty()) {
            System.out.println("A pilha está vazia. Não há livros para retirar.");
        } else {
            String livroRetirado = pilhaLivros.pop();
            System.out.println("Livro retirado: " + livroRetirado);
        }



	}

}
