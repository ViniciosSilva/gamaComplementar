package entities;

public class FuncionarioSenior extends Funcionario {

	private double bonus;

	public FuncionarioSenior(String nome, int horasTrabalhadas, double valorPorHora, double bonus) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double calcularBonus() { 
		return (horasTrabalhadas/10) *bonus;   
	}
	
	public double calcularSalario() {
		return valorPorHora * horasTrabalhadas+calcularBonus();
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Valor por hora: R$" + valorPorHora + ", Horas trabalhadas: " + horasTrabalhadas
				+ "Bonus adicional: R$" + calcularBonus() + ", Salário total: R$"
				+ calcularSalario();
	}

}
