package curso_programacao;

import java.util.Scanner;

public class exercicio3EstruturaRepetitivas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tipo, totAlcool, totGasolina, totDiesel;
		totAlcool = 0;
		totGasolina = 0;
		totDiesel = 0;

		System.out.println("Informe 1-Alcool 2-Gasolina 3-Diesel 4-Fim");
		tipo = sc.nextInt();

		while (tipo != 4) {
			switch (tipo) {
			case 1:
				totAlcool += 1;
				break;
			case 2:
				totGasolina += 1;
				break;
			case 3:
				totDiesel += 1;
				break;

			default:
				break;
			}
			System.out.println("Informe 1-Alcool 2-Gasolina 3-Diesel 4-Fim");
			tipo = sc.nextInt();
		}
		
		if(tipo==4) {
			System.out.printf("Muito Obrigado! %nAlcool = %d %nGasolina = %d %nDiesel = %d",totAlcool, totGasolina, totDiesel);
		}

	}

}
