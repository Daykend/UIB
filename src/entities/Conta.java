package entities;

public class Conta {
	public String number;
	public double saldo;
	public Cliente cliente;
	
	public Conta() {
		
	}
	
	public Conta(String number, Cliente cliente) {
		this.number = number;
		this.cliente = cliente;
	}
	
	public void creditar(double valor) {
		saldo += valor;		
	}
	
	public void debitar(double valor) {
		saldo -= valor;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public String toString() {
		return "Conta: " + number + "     Saldo atual: " + saldo;
	}
	
	
}
