package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class Exercicio2Lista2 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o nome do colaborador: ");
        String nomeColaborador = scanner.nextLine();

        
        System.out.print("Digite o código do cargo do colaborador (1 a 6): ");
        int codigoCargo = scanner.nextInt();

        
        System.out.print("Digite o salário do colaborador: ");
        float salario = scanner.nextFloat();

 
        float percentualReajuste = 0;

        switch (codigoCargo) {
            case 1:
                percentualReajuste = 0.10f;
                break;
            case 2:
                percentualReajuste = 0.07f; 
                break;
            case 3:
                percentualReajuste = 0.09f; 
                break;
            case 4:
                percentualReajuste = 0.06f;
                break;
            case 5:
                percentualReajuste = 0.05f; 
                break;
            case 6:
                percentualReajuste = 0.08f; 
                break;
            default:
                System.out.println("Código de cargo inválido. O programa será encerrado.");
                System.exit(0);
        }

        
        float novoSalario = salario + (percentualReajuste * salario);

        
        System.out.println("\nNome do Colaborador: " + nomeColaborador);
        System.out.println("Cargo: " + obterNomeCargo(codigoCargo));
        System.out.println("Salário Anterior: R$ " + salario);
        System.out.println("Percentual de Reajuste: " + (percentualReajuste * 100) + "%");
        System.out.println("Novo Salário: R$ " + novoSalario);
    }

    
    public static String obterNomeCargo(int codigoCargo) {
        switch (codigoCargo) {
            case 1:
                return "Gerente";
            case 2:
                return "Vendedor";
            case 3:
                return "Supervisor";
            case 4:
                return "Motorista";
            case 5:
                return "Estoquista";
            case 6:
                return "Técnico em TI";
            default:
                return "Cargo Desconhecido";
        }


	}

}
