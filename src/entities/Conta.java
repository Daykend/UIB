package entities;

public class Conta {
	public String number;
	public double saldo;
	public Cliente cliente;
	
	public String toString() {
		return number + "       " + saldo;
	}
	
	
}
