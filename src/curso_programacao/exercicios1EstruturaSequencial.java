package curso_programacao;

import java.util.Scanner;

public class exercicios1EstruturaSequencial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("Digite o primeiro n�mero:");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		b = sc.nextInt();
		
		soma = a + b;
		System.out.println("A soma dos numeros �: "+soma);
		sc.close();
	}

}
