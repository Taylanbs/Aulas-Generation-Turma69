package exercicios;

import java.util.Scanner;

public class AtividadeTres {

	public static void main(String[] args) {
		float salarioBruto,adicionalNoturno,horaExtra,desconto,salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o Salario Bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("\nDigite o valor do adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("\nDigite o valor das horas extras: ");
		horaExtra = leia.nextFloat();
		System.out.println("\nDigite o valor dos descontos: ");
		desconto = leia.nextFloat();
		
		salarioLiquido = (salarioBruto+adicionalNoturno+(horaExtra*5)- desconto);
		System.out.printf("\nSeu saldo final é de: %.2f ", +salarioLiquido);

		

	}

}
