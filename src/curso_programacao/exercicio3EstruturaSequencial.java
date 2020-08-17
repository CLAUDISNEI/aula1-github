package curso_programacao;

import java.util.Scanner;

public class exercicio3EstruturaSequencial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d,diferenca;
		
		System.out.println("Entre com os quatro números:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferenca = (a*b - c*d);
		
		System.out.println("Diferença dos produtos: "+diferenca);

	}

}
