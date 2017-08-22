
public class PessoaFisica extends Cliente{
	private int idade, rg, cpf;
	private String sexo;
	
	public PessoaFisica(String nome, String endereco, int idade, int rg, int cpf, String sexo) {
		super(nome, endereco);
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String toString() {
		return "PessoaFisica [idade=" + idade + ", rg=" + rg + ", cpf=" + cpf
				+ ", sexo=" + sexo + "]";
	}

}
