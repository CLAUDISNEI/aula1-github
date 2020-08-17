package curso_programacao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class aulaSobreList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		// adicionando elementos
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("------------------------------");

		// adicionando em um endereço específico
		list.add(2, "Marco");

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("------------------------------");

		// tamanho da lista
		System.out.println(list.size());

		System.out.println("------------------------------");

		// remover elemento por comparação
		list.remove("Anna");

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("------------------------------");

		// remover elemento por endereco
		list.remove(1);

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("------------------------------");

		// remover elemento que possuem um predicado
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("------------------------------");

		// adicionando novamente os elementos

		list.add("Maria");
		list.add("Alex");
		list.add("Anna");
		list.add(2, "Marco");

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("------------------------------");

		// verificando o indice de um elemento qualquer

		System.out.println("Indice de Bob: " + list.indexOf("Bob"));

		System.out.println("------------------------------");

		// retornando indice de um elemeno não existente na lista

		System.out.println("Indice de Joao: " + list.indexOf("Joao"));

		System.out.println("------------------------------");
		
		//deixando na lista somente nomes que começam com M
		//tem que criar uma outra lista que vai receber a lista filtrada
		
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : resultado) {
			System.out.println(x);
		}

		System.out.println("------------------------------");
		
		//encontrado um elemento que atenda por um predicado
		
		String nome = list.stream().filter(x -> x.charAt(0) == 'M' ).findFirst().orElse(null);
		System.out.println(nome);

	}

}
