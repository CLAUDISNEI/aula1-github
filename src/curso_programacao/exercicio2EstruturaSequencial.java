package curso_programacao;

import java.util.Scanner;

public class exercicio2EstruturaSequencial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio,area;
		
		System.out.println("Informe o raio da circufer�ncia: ");
		raio = sc.nextDouble();
		area = pi*Math.pow(raio, 2.0);
		System.out.printf("A �rea do circulo �: %.4f",area);
		

	}

}
