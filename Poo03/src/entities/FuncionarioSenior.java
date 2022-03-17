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

	public double calcularBonus(double bonus, int horasTrabalhadas) {
		int x = 0;

		while (horasTrabalhadas >= 10) {
			x++;
			horasTrabalhadas -= 10;
		}
		return bonus * x;
	}
	
	@Override
	public double calcularSalario(double valorPorHora, int horasTrabalhadas) {
		return valorPorHora * horasTrabalhadas + calcularBonus(bonus, horasTrabalhadas);
	}
	
	@Override
	public String toString() {
		return "Nome: "+nome+", Valor por hora: R$"+valorPorHora+", Horas trabalhadas: "+horasTrabalhadas+"Bonus adicional: R$"+calcularBonus(bonus, horasTrabalhadas)+", Salário total: R$"+calcularSalario(valorPorHora, horasTrabalhadas);
	}

}
