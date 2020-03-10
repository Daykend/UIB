package entities;

public class Conta {
	private Integer number;
	private double saldo;
	private Cliente cliente;
	
	public Conta() {
		
	}
	
	public Conta(Integer number, Cliente cliente) {
		this.number = number;
		this.cliente = cliente;
	}
	
	public void creditar(double valor) {
		saldo += valor;		
	}
	
	public void debitar(double valor) {
		saldo -= valor;
	}
	
	public String transferir(Conta conta, double valor) {
		if (saldo < valor) {
			return "Saldo atual insuficiente!";
		}else {
			debitar(valor);
			conta.creditar(valor);
			return "Operação Realizada com Sucesso!";
		}
		
	}
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
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
		return "Conta: " + number + "     Saldo atual: " + String.format("%.2f", saldo);
	}
	
	
}
