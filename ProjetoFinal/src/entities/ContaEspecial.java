package entities;

public class ContaEspecial extends Conta{

	private double limite;

	public ContaEspecial(int numero, double limite) {
		super(numero);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(double valor) {
		if(saldo>=valor) {
			saldo -= valor;
		}else if(saldo+limite>valor) {
			saldo = (saldo + limite) - valor;
		}
			}
	
	@Override
	public String toString() {
		return "N�mero da conta: "+getNumero()+String.format("Saldo: R$%.2f", getSaldo())+String.format(", Limite dispon�vel: R$%.2f", getLimite());
	}
	
}
