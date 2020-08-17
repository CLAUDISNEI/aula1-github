package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.FuncionarioList;

public class exercicio1List {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * List<Integer> idFuncionario = new ArrayList<>(); List<String> nomeFuncionario
		 * = new ArrayList<String>(); List<Double> salarioFuncionario = new
		 * ArrayList<Double>();
		 */

		List<FuncionarioList> listaFuncionarios = new ArrayList<>();
		FuncionarioList funcionario;

		System.out.print("Quantidade de funcionário para cadastrar: ");
		int quantidadeCadastros = sc.nextInt();
		sc.nextLine();

		System.out.println("Entre com as informações:");

		int matricula;
		String nome;
		double salario;

		for (int i = 0; i < quantidadeCadastros; i++) {

			System.out.println("Empregado : " + (i + 1));
			System.out.print("ID:");
			matricula = sc.nextInt();
			while(idExiste(listaFuncionarios, matricula)) {
				System.out.println("Essa matrícula já existe, tente novamente: ");
				matricula = sc.nextInt();
			}

			sc.nextLine();
			System.out.print("Nome: ");
			nome = sc.nextLine();

			System.out.print("Salário: ");
			salario = sc.nextDouble();
			System.out.println();

			funcionario = new FuncionarioList(matricula, nome, salario);
			listaFuncionarios.add(funcionario);
		}

		System.out.print("Entre a mátricula do funcionario que receberá aumento: ");
		int matriculaAumento = sc.nextInt();
		sc.nextLine();

		
		// função para localizar o id fornecido

		/* int localizacaoFuncionario = localizarId(listaFuncionarios,
		 matriculaAumento);

		if (localizacaoFuncionario != -1) {
			System.out.print("Entre com o percentual de aumento: ");
			double percentualAumento = sc.nextDouble();

			listaFuncionarios.get(localizacaoFuncionario).aumentarSalario(percentualAumento);
		} else {
			System.out.println("--------------------------");
			System.out.println("Empregado não encontrado");
			System.out.println("--------------------------");
		} */

		
		// localizando utilizando expressões lambda
		FuncionarioList buscaFuncionario = listaFuncionarios.stream()
				.filter(x -> x.getIdFuncionario() == matriculaAumento).findFirst().orElse(null);
		
		if (buscaFuncionario != null) {
			System.out.print("Entre com o percentual de aumento: ");
			double percentualAumento = sc.nextDouble();

			buscaFuncionario.aumentarSalario(percentualAumento);
		} else {
			System.out.println("--------------------------");
			System.out.println("Empregado não encontrado");
			System.out.println("--------------------------");
		} 

		System.out.println("Lista de empregados: ");

		for (FuncionarioList x : listaFuncionarios) {
			System.out.println(x);
		}

		sc.close();

	}

	public static int localizarId(List<FuncionarioList> lista, int idFuncionario) {
		int posicao = -1;

		for (int x = 0; x < lista.size(); x++) {
			if (lista.get(x).getIdFuncionario() == idFuncionario) {
				posicao = x;
			}
		}

		return posicao;
	}
	
	public static boolean idExiste(List<FuncionarioList> f, int numId) {
		
		FuncionarioList id = f.stream().filter(x -> x.getIdFuncionario() == numId).findFirst().orElse(null);
		
		return  id != null;
	}

}
