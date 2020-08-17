package curso_programacao;

import java.util.Scanner;

public class exercicio4EstruturaSequencial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numFuncionario, horaTrabalhada;
		double valorHora, salarioFuncionario;
		
		System.out.println("Informe o número do funcionário:");
		numFuncionario = sc.nextInt();
		
		System.out.println("Informe o número de horas trabalhadas:");
		horaTrabalhada = sc.nextInt();
		
		System.out.println("Informe o valor da hora :");
		valorHora = sc.nextDouble();
		
		salarioFuncionario = horaTrabalhada*valorHora;
		
		System.out.printf("Número: %d %nSalário: U$ %.2f",numFuncionario, salarioFuncionario);
		

	}

}
