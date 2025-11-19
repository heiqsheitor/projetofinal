package trabalho;

public class Servico {
	private String nomeServico;
	private double preco;
	
	// construtor
	public Servico(String nomeServico, double preco) {
		super();
		this.nomeServico = nomeServico;
		this.preco = preco;
	}

	// gets
	public String getNomeServico() {
		return nomeServico;
	}

	public double getPreco() {
		return preco;
	}
}