package curso_programacao;

import java.util.Scanner;

public class exercicio1EstruturaRepetitiva {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int senha;
		
		System.out.println("Digite a Senha:");
		senha = sc.nextInt();
		
		while(senha!=2002) {
			System.out.println("Senha inválida!");
			
			System.out.println("Digite a Senha:");
			senha = sc.nextInt();
		}
		
		if(senha==2002)
			System.out.println("Acesso Permitido!");
		
		

	}

}
