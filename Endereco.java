
public class Endereco extends Cliente{

	private String rua, bairro, cidade, complemento, pontoRef;
	private int numCasa, cep, fone;
	
	public Endereco(String rua, String bairro, String cidade,
			String complemento, String pontoRef, int numCasa, int cep, int fone) {
		this.rua = null;
		this.bairro = null;
		this.cidade = null;
		this.complemento = null;
		this.pontoRef = null;
		this.numCasa = 0;
		this.cep = 00000-000;
		this.fone = 0;
	}
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getPontoRef() {
		return pontoRef;
	}

	public void setPontoRef(String pontoRef) {
		this.pontoRef = pontoRef;
	}

	public int getNumCasa() {
		return numCasa;
	}

	public void setNumCasa(int numCasa) {
		this.numCasa = numCasa;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getFone() {
		return fone;
	}

	public void setFone(int fone) {
		this.fone = fone;
	}

	public void cadastrarEndereco(){
		
	}
	
	public void alterarEndereco(){
		
	}
	
	public void cancelarEndereco(){
		
	}
	
	
}
