
public class Carro {

	private String marca;
	private String modelo;
	private double consumo;

	public Carro(String marca, String modelo, double consumo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.consumo = consumo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "Marca: "+marca + ", modelo: " + modelo + ", Consulmo: " + consumo+"/L";
	}

}
