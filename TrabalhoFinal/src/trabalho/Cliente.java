package trabalho;

public class Cliente {
	private String nome;
	private String senha;
	private String msg;
	
	// construtor e dados de login
	public Cliente(String nome, String senha, int telefone) {
		super();
		this.nome = "heitor";
		this.senha = "123";
		this.msg = "Bem vindo(a)";
	}

	// os get
	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}
	
	public String getMsg() {
		return msg;
	}	
}