package curso_programacao;

import java.util.Scanner;

public class exercicio1Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int linhas, colunas;

		System.out.print("Entre com o número de linhas e colunas: ");
		linhas = sc.nextInt();
		colunas = sc.nextInt();

		int[][] mat = new int[linhas][colunas];

		for (int i = 0; i < mat.length; i++) {
			System.out.println("Entre todos os valores da linha:");
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("mat["+i+"]["+j+"] = ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Entre com um número:");
		
		int numero = sc.nextInt();
		
		for(int a = 0; a<mat.length; a++) {
			for(int b = a; b<mat[a].length; b++) {
				if(mat[a][b]==numero) {
					System.out.println("Posição: "+a+","+b);
					if(b>0) {
					System.out.println("Esquerda: "+mat[a][b-1]);
					}
					if(b < colunas-1) {
					System.out.println("Direita: "+mat[a][b+1]);
					}
					if(a>0) {
					System.out.println("Superior: "+mat[a-1][b]);
					}
					if(a< linhas-1) {
					System.out.println("Inferior: "+mat[a+1][b]);
					}
				}
			}
		}
		

	}

}
