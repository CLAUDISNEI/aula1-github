package curso_programacao;

import java.util.Scanner;

public class exercicio5EstruturaSequencial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, codPeca2, numPecas1, numPecas2;
		double valUnitPeca1, valUnitPeca2, valPago;
		
		System.out.println("C�digo da pe�a 1:");
		codPeca1 = sc.nextInt();
		
		System.out.println("Quantidade pe�a 1:");
		numPecas1 = sc.nextInt();
		
		System.out.println("Valor da pe�a 1:");
		valUnitPeca1 = sc.nextDouble();
		
		System.out.println("C�digo da pe�a 2:");
		codPeca2 = sc.nextInt();
		
		System.out.println("Quantidade pe�a 2:");
		numPecas2 = sc.nextInt();
		
		System.out.println("Valor da pe�a 2:");
		valUnitPeca2 = sc.nextDouble();
		
		valPago = (valUnitPeca1*numPecas1 + valUnitPeca2*numPecas2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valPago);
		
		
		
		

	}

}
