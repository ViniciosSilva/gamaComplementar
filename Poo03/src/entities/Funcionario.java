package entities;

public class Funcionario {

	protected String nome;
	protected int horasTrabalhadas;
	protected double valorPorHora;
	
	public Funcionario(String nome, int horasTrabalhadas, double valorPorHora) {
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public double calcularSalario() {
		return valorPorHora * horasTrabalhadas;
	}
	@Override
	public String toString() {
		return "Nome: "+nome+", Valor por hora: R$"+valorPorHora+", Horas trabalhadas: "+horasTrabalhadas+", Salário total: R$"+calcularSalario();
	}
}
