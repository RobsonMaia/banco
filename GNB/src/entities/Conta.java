package entities;

public class Conta {

	public int numConta;
	public int agencia;
	public double saldo;
	public String titular;
	public double valor;
	
	public double dopositar(double valor) {
		return saldo += valor;
	}
	
	public double sacar(double valor) {
		if (valor > saldo) {
			System.out.println("SALDO INSUFICIENTE!");
		}
		else {
			return saldo -= valor;
		}
		return valor;
	}
	
	public String toString() {
		return "TITULAR: " + titular 
				+ ", SALDO: R$" + String.format("%.2f", saldo)
				+ "  AGENCIA: " + agencia
				+ ", CONTA: " + numConta; 
	}
}
