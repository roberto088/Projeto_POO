
public class PessoaJuridica extends Cliente{
	
	private int cnpj;
	private String nomeFantasia;
	
	public PessoaJuridica(String nome, String endereco, int cnpj, String nomeFantasia) {
		super(nome, endereco);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", nomeFantasia="
				+ nomeFantasia + "]";
	}
	
	
	

}
