package curso_programacao;

import java.util.Scanner;

public class exercicio5EstruturaSequencial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, codPeca2, numPecas1, numPecas2;
		double valUnitPeca1, valUnitPeca2, valPago;
		
		System.out.println("Código da peça 1:");
		codPeca1 = sc.nextInt();
		
		System.out.println("Quantidade peça 1:");
		numPecas1 = sc.nextInt();
		
		System.out.println("Valor da peça 1:");
		valUnitPeca1 = sc.nextDouble();
		
		System.out.println("Código da peça 2:");
		codPeca2 = sc.nextInt();
		
		System.out.println("Quantidade peça 2:");
		numPecas2 = sc.nextInt();
		
		System.out.println("Valor da peça 2:");
		valUnitPeca2 = sc.nextDouble();
		
		valPago = (valUnitPeca1*numPecas1 + valUnitPeca2*numPecas2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valPago);
		
		
		
		

	}

}
