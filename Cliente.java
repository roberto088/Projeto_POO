
public abstract class Cliente {

	protected String nome, endereco;
	
	
	public Cliente(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String toString() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + "]";
	}

	
	
}
