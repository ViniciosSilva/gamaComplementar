package entities;

public abstract class Conta {

	protected int numero;
	protected double saldo;

	public Conta(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		saldo -= valor;
	}

	public String toString() {
		return "Número da conta: "+getNumero()+", Saldo: "+String.format(" %.2f", getSaldo());
	}
	
}
