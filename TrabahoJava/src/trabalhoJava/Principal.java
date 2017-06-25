package trabalhoJava;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int opcao;
		int codigoConsulta;
		String nomePaciente;
		String planoPaciente;
		String nomeMedico;
		String especialidadeMedico;

		Scanner scaner = new Scanner(System.in);

		// Classe de "Estrutura de dados" que gerenciara os dados da consulta
		GerenciadorDeConsultas gerenciadorDeConsultas = new GerenciadorDeConsultas();

		// Inicia a estrutura do menu
		// Escolhido do/while, pois permite captura a opção do menu e depois
		// validar
		do {

			System.out.println("Por favor, escolha uma das opcoes abaixo:");
			System.out.println("1 - Marcar Consulta");
			System.out.println("2 - Consultar consulta pelo Nome do paciente");
			System.out.println("3 - Consultar consulta pelo codigo");
			System.out.println("4 - Cancelar consulta");
			System.out.println("5 - Lista de todas as consultas");
			System.out.println("0 - Encerrar Sistema");

			// Captura numero digitado pelo usuario
			// nextInt aceita apenas valores do tipo Inteiro
			opcao = scaner.nextInt();

			if (opcao == 1) {
				// O comando nextLine() pega toda a ultima linha digitada e
				// tranfotma em String
				System.out.println("Informe nome do paciente");
				nomePaciente = scaner.next();
				System.out.println("Informe o plano do paciente");
				planoPaciente = scaner.next();
				System.out.println("Informe o nome do Médico");
				nomeMedico = scaner.next();
				System.out.println("Informe a especialidade do Médico");
				especialidadeMedico = scaner.next();

				// metodo do gerenciador usado para marcar a consulta
				// para isso ele precisa:
				// do nome do paciente, plano do paciente, nome do medico,
				// especialidade do medico
				gerenciadorDeConsultas.marcarConsulta(nomePaciente,
						planoPaciente, nomeMedico, especialidadeMedico);
			}
			if (opcao == 2) {
				System.out.println("informe o nome do paciente");
				nomePaciente = scaner.next();
				// mostra consultas que possuam o nome do paciente
				gerenciadorDeConsultas.consultarPorNomePacinete(nomePaciente);
			}
			if (opcao == 3) {
				System.out.println("informe o codigo da consulta");
				codigoConsulta = scaner.nextInt();
				// mostra consultas que tenham o codigo informado
				gerenciadorDeConsultas.consutarPorCodigo(codigoConsulta);
			}
			if (opcao == 4) {
				System.out.println("informe o codigo da consulta que deseja cancelar");
				codigoConsulta = scaner.nextInt();
				// removera da lista consulta com o codigo informado
				gerenciadorDeConsultas.removerConsulta(codigoConsulta);
			}
			if (opcao == 5) {
				// Lista todas as consultas
				gerenciadorDeConsultas.listarTodasAsConsutas();

			}

			// verifica se é 0, finaliza o programa
			// qualquer coisa diferente de 0, sistema retorna para o inicio do
			// menu
		} while (opcao != 0);
		// Fim do menu

		//Ao usar a classe Scaner é obrigatorio finaliza-lo no fim do programa
		
		scaner.close();
	}

}
