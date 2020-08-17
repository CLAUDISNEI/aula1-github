package curso_programacao;

public class exemploCasting {

	public static void main(String[] args) {
		
		int a,b;
		double resultado;
		
		a = 5;
		b= 2;
		
		resultado = a/b;
		
		System.out.println("Resultado:"+ resultado);
		
		resultado = (double) a/b;
		
		System.out.println("Resultado:"+ resultado);


	}

}
