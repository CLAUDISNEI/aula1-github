package curso_programacao;

import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		String x;		
		x = sc.next();
		
		System.out.println("Você digitou:"+ x);
		
		int a;
		a = sc.nextInt();
		
		System.out.println("Você digitou:"+ a);
		
		
		
		char st;
		
		st = sc.next().charAt(0);
		
		System.out.println("Você digitou: "+st);
		
		sc.close();
		
		
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		*/
		
		String s1, s2, s3;
		int x;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
		
		

	}

}
