package curso_programacao;

import java.util.Vector;

public class funcoesParaStrings {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG   ";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUperCase: -" + s02 + "-");
		System.out.println("trim: " + s03 + "-");
		System.out.println("susbring(2): -" + s04 + "-");
		System.out.println("susbring(2 , 9): -" + s05 + "-");
		System.out.println("replace('a','x'): -" + s06 + "-");
		System.out.println("replace('abc' ,'xy'): -" + s07 + "-");
		System.out.println("indexOf('bc'): " + i);
		System.out.println("LastIndexOf('bc'): " + j);

		// utilizando opera��o split
		String s = "potato apple lemon orange";

		String[] vect = s.split(" ");
		int a = vect.length;

		for (int b = 0; b < a; b++)
			System.out.println("Teste de split: "+vect[b]);

	}

}
