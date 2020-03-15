package entities;

public class Cliente {
	
	private String name;
	private String cpf;
	private String email;
	private String dataNasci;
	private Conta conta;
	
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
	
	public Conta getConta() {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNasci() {
		return dataNasci;
	}

	public void setDataNasci(String dataNasci) {
		this.dataNasci = dataNasci;
	}
	
	public boolean verificarDadosDoCliente (String cpf, String email, String dataNascimento) {
		if(getCpf().equals(cpf) && getEmail().equals(email) && getDataNasci().equals(dataNascimento)){
			return true;
			
		} else {
			return false;
		}
	}

	public String toString() {
		return "Cliente: " + name + "     CPF: " + cpf + "\n" + conta;
	}
	
}
