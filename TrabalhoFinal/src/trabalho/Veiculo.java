package trabalho;

public class Veiculo {
	private String placa;
	private String modelo;
	private String marca;
	private int ano;
	
	// associação cliente para veiculo
	private Cliente cliente;
	
	// construtor
	public Veiculo(String placa, String modelo, String marca, int ano) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public int getAno() {
		return ano;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
}