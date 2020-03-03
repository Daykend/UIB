package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Conta;

public class UIBMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta1 = new Conta();
		Cliente cliente1 = new Cliente();
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		cliente1.setName(name);
		System.out.println();
		System.out.print("CPF: ");
		String cpf = sc.nextLine();
		cliente1.setCpf(cpf);
		
		conta1.setCliente(cliente1);
		conta1.setNumber("0001-1");
		cliente1.conta = conta1;
		
		System.out.println(cliente1);
		System.out.println("------------------------------");
		
		System.out.print("Valor a ser creditado: ");
		double valor = sc.nextDouble();
		conta1.creditar(valor);
		
		System.out.println();
		System.out.println("Updated Data:");
		System.out.println(cliente1);
		System.out.println("------------------------------");
		
		System.out.print("Valor a ser debitado: ");
		valor = sc.nextDouble();
		conta1.debitar(valor);
		
		System.out.println();
		System.out.println("Updated Data:");
		System.out.println(cliente1);
		
		
		sc.close();
	}

}
