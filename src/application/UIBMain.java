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
		cliente1.name = sc.nextLine();
		System.out.println();
		System.out.print("CPF: ");
		cliente1.CPF = sc.nextLine();
		
		conta1.saldo = 1500;
		conta1.number = "0001";
		cliente1.conta = conta1;
		
		
		System.out.println(cliente1);
		
		sc.close();
	}

}
