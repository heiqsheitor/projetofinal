package trabalho;

public class Agendamento {
	private String data;
	
	// associação das classes para o agendamento
		private Cliente cliente;
		private Veiculo veiculo;
		private Servico servico;
		
	// construtor
	public Agendamento(Cliente cliente, Veiculo veiculo, Servico servico, String data) {
		super();
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.servico = servico;
		this.data = data;
	}

	// gets
	
	public String getData() {
		return data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public Servico getServico() {
		return servico;
	}
}