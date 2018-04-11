package aula04;

import java.util.Scanner;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 31/07/14

public class TestarFamilia {

	public static void main(String[] args) {

		// Cria o objeto Pai
		Pai pai = new Pai("Rivelino", 42);

		// Cria o objeto Mae
		Mae mae = new Mae("Maria Socorro", 40);

		// Criando o objeto Crianca
		Crianca crianca = new Crianca("Myllena", pai, mae);

		System.out
				.println("Deseja exibir os dados computados/cadastrados? \nSIM ou NAO");
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		String opc = entrada.nextLine();
		switch (opc.toUpperCase()) {
		case "SIM":
			imprimirDadosPessoais(crianca);
			break;
		case "NAO":
			alterarDadosPessoais(crianca, pai, mae);
			break;
		default:
			System.out.println("Opção não cadastrada");
			alterarDadosPessoais(crianca, pai, mae);
			break;
		}

	}

	private static void imprimirDadosPessoais(Crianca crianca) {
		// Exibindo os valores dos atributos
		System.out.println("Nome do(a) filho(a): " + crianca.getNome());
		System.out.println("Nome da mãe da criança: "
				+ crianca.getMae().getNome());
		System.out.println("Idade da mãe da criança: "
				+ crianca.getMae().getIdade());
		System.out.println("Nome da pai da criança: "
				+ crianca.getPai().getNome());
		System.out.println("Idade da pai da criança: "
				+ crianca.getPai().getIdade());
	}

	@SuppressWarnings("resource")
	private static void alterarDadosPessoais(Crianca crianca, Pai pai, Mae mae) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Deseja atualizar os dados pesoais?");
		System.out.println("1 = SIM ou 2 = NAO");
		byte opcao;
		try {
			opcao = entrada.nextByte();
		} catch (Exception e) {
			opcao = entrada.nextByte();
		}
		if (opcao == 1) {
			System.out
					.println("Digite o numero corresponde a opcao que deseja alterar");
			System.out
					.println("1 = Nome da crianca \n2 = Nome da Mãe \n3 = Idade da Mãe \n4 = Nome do Pai \n5 = Idade do Pai");
			entrada = new Scanner(System.in);
			byte key;
			try {
				key = entrada.nextByte();
			} catch (Exception e) {
				key = entrada.nextByte();
			}

			switch (key) {
			case 1:
				System.out.println("Informe o nome da Criança:");
				entrada = new Scanner(System.in);
				String nomeCrianca = entrada.nextLine();
				crianca.setNome(nomeCrianca);
				alterarDadosPessoais(crianca, pai, mae);
				break;
			case 2:
				System.out.println("Informe o nome da Mãe:");
				entrada = new Scanner(System.in);
				String nomeMae = entrada.nextLine();
				mae.setNome(nomeMae);
				crianca.setMae(mae);
				alterarDadosPessoais(crianca, pai, mae);
				break;
			case 3:
				System.out.println("informe a idade da Mãe:");
				entrada = new Scanner(System.in);
				int idadeMae = entrada.nextInt();
				mae.setIdade(idadeMae);
				crianca.setMae(mae);
				alterarDadosPessoais(crianca, pai, mae);
				break;
			case 4:
				System.out.println("Informe o nome do Pai:");
				entrada = new Scanner(System.in);
				String nomePai = entrada.nextLine();
				pai.setNome(nomePai);
				crianca.setPai(pai);
				alterarDadosPessoais(crianca, pai, mae);
				break;
			case 5:
				System.out.println("Informe a idade do Pai:");
				entrada = new Scanner(System.in);
				int idadePai = entrada.nextInt();
				pai.setIdade(idadePai);
				crianca.setPai(pai);
				alterarDadosPessoais(crianca, pai, mae);
				break;
			default:
				System.out.println("Opção não cadastradas");
				break;
			}

		} else {
			imprimirDadosPessoais(crianca);
		}

	}

}