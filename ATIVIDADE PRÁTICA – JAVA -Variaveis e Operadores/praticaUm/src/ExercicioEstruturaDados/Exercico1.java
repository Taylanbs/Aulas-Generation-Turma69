package ExercicioEstruturaDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercico1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Queue<String> filaClientes = new LinkedList<>();

        int opcao;
        do {
            exibirMenu();
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarCliente(filaClientes, scanner);
                    break;
                case 2:
                    listarClientes(filaClientes);
                    break;
                case 3:
                    chamarCliente(filaClientes);
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

    }

    private static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1: Adicionar Cliente na Fila");
        System.out.println("2: Listar Clientes na Fila");
        System.out.println("3: Chamar Cliente da Fila");
        System.out.println("0: Sair do Programa");
    }

    private static void adicionarCliente(Queue<String> filaClientes, Scanner scanner) {
        System.out.print("Digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        filaClientes.add(nomeCliente);
        System.out.println("Cliente adicionado na fila.");
    }

    private static void listarClientes(Queue<String> filaClientes) {
        if (filaClientes.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Clientes na fila:");
            for (String cliente : filaClientes) {
                System.out.println(cliente);
            }
        }
    }

    private static void chamarCliente(Queue<String> filaClientes) {
        if (filaClientes.isEmpty()) {
            System.out.println("A fila está vazia. Não há clientes para chamar.");
        } else {
            String clienteChamado = filaClientes.poll();
            System.out.println("Cliente chamado: " + clienteChamado);
        }


	}

}
