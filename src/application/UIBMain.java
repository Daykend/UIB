package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Conta;

public class UIBMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		

		final int TOTAL_DE_CADASTROS = 1000;
		Cliente clientes[] = new Cliente[TOTAL_DE_CADASTROS];
		Conta contas[] = new Conta[TOTAL_DE_CADASTROS];
		int opcao = -1;

		do {
			System.out.println("Bem Vindo ao Unit Internet Bank!");
			System.out.println("--------------------------------");
			System.out.println("[1] - Cadastro Cliente / Conta     " + "     [2] - Saque");
			System.out.println("[3] - Consultar Saldo              " + "     [4] - Depósito em Conta");
			System.out.println("[5] - Consultar Informações da Conta" + "    [6] - Transferência");
			System.out.println("[7] - Redefinir Senha da Conta      " + "    [8] - Sair");
			opcao = sc.nextInt();

			// Opção de Cadastro, Cliente e Conta
			if (opcao == 1) {
				int i = 0;
				while(true) {
					sc.nextLine();
					clientes[i]  = new Cliente();
					contas[i]  = new Conta();
					System.out.print("Digite o nome do "+ (i+1)+"° Cliente: ");
					clientes[i].setName(sc.nextLine());
					System.out.println();
					System.out.print("Digite o CPF: ");
					clientes[i].setCpf(sc.next());
					contas[i].setNumber(1001 + i);
					System.out.print("Digite uma senha numérica com 4 digitos: ");
					contas[i].setSenha(sc.nextInt());
					System.out.println();
					System.out.print("Digite o valor para deposito inical da conta de " + clientes[i].getName() + ": ");
					contas[i].creditar(sc.nextDouble());
					System.out.println();
					contas[i].setCliente(clientes[i]);
					clientes[i].setConta(contas[i]);
					i++;
					System.out.println("Deseja cadastrar um novo cliente? (s/n): ");
					char escolha = sc.next().charAt(0);
					if(escolha == 'n') {
						break;
					} else {
						continue;
					}
				}
				System.out.println("---------------------------------------");
				System.out.println("Clientes Cadastrados:");
				for (Cliente c : clientes) {
					System.out.println(c + "\n");						
				}

			}
			//Opção de Saque (Debitar valor em Saldo de Conta)
			else if(opcao == 2) {
				System.out.print("Confirme o numero da conta: ");
				int accountNumber = sc.nextInt();
				for(Conta c : contas) {
					if(c.getNumber() == accountNumber)
						System.out.print("Digite o valor: ");
						int valor = sc.nextInt();
						if(valor > c.getSaldo()) {
							System.out.println("Saldo Insuficiente!");
							break;
						} else {
							c.debitar(valor);
							System.out.println("Operação Realizada!");
						}
				}
			}


		} while(opcao != 8);

		System.out.println("Operação Finalizada!");


		sc.close();
	}

}