package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Conta;

public class UIBMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos cadastros serão realizados: ");
		final int TOTAL_DE_CADASTROS = sc.nextInt();
		Cliente clientes[] = new Cliente[TOTAL_DE_CADASTROS];
		Conta contas[] = new Conta[TOTAL_DE_CADASTROS];
		
		
		int opcao = 99;
		do {
			System.out.println("Bem Vindo ao Unit Internet Bank!");
			System.out.println("--------------------------------");
			System.out.println();
			
			
		} while(opcao != 0);
		
		
		
		for (int i=0; i < TOTAL_DE_CADASTROS; i++) {
			clientes[i] = new Cliente();
			contas[i] = new Conta();
			System.out.printf("Digite o nome do %d° Cliente:%n", i);
			clientes[i].setName(sc.next());
			System.out.println("Digite o CPF: ");
			clientes[i].setCpf(sc.next());
			contas[i].setNumber(1001 + i);
			System.out.println("Digite o deposito inical para conta de " + clientes[i].getName() + ": ");
			contas[i].creditar(sc.nextDouble());
			contas[i].setCliente(clientes[i]);
			System.out.println("---------------------------------------");
			contas[i].setCliente(clientes[i]);
			clientes[i].setConta(contas[i]);
			
		}
		
		
		
		
		sc.close();
	}

}