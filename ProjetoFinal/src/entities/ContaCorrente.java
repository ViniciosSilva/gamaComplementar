package entities;

public class ContaCorrente extends Conta{

	public ContaCorrente(int numero) {
		super(numero);
	}

	@Override
public void sacar(double valor) {
	if(saldo>=valor) {
		saldo-=valor;
	}
}
	
}
