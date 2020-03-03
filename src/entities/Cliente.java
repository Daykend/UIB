package entities;

public class Cliente {
	
	private String name;
	private String cpf;
	public Conta conta;
	
	public Cliente() {
		
	}
		
	public Cliente(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		return "Cliente: " + name + "     CPF: " + cpf + "\n" + conta;
	}
	
}
