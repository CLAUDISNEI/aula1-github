package curso_programacao;

import java.util.Scanner;

public class exercicio1EstruturaFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("Digite um valor:");
		n = sc.nextInt();

		while (n < 1 || n > 1000) {
			System.out.println("Digite um valor válido:");
			n = sc.nextInt();
		}
		
		System.out.println("Numeros impares:");
		for (int x = 1; x <= n; x++) {
			if(x % 2 !=0) {
				System.out.println(x);
			}
		}

	}

}
