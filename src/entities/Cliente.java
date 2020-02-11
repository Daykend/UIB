package entities;

public class Cliente {
	
	public String name;
	public String CPF;
	public Conta conta;
	
	public String toString() {
		return name + "  " + CPF + "\n" + conta;
	}
	
}
