package curso_programacao;

import java.util.Scanner;

public class exercicio6EstruturaSequencial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float a,b,c;
		double pi;
		
		System.out.println("Informe três valores:");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		pi = 3.14159;
		
		System.out.printf("TRIANGULO: %.3f %n", (a*c)/2);
		
		System.out.printf("CIRCULO: %.3f %n", pi*(Math.pow(c, 2)) );
		
		System.out.printf("TRAPEZIO: %.3f %n", ((a+b)*c)/2 );
		
		System.out.printf("QUADRADO: %.3f %n", b*b );
		
		System.out.printf("RETANGULO: %.3f %n", a*b );

	}

}
