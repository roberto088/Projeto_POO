
public class Contrato extends Cliente{

	private int velocidade;
	private String tipoPlano;
	
	public Contrato(int velocidade, String tipoPlano) {
		this.velocidade = velocidade;
		this.tipoPlano = tipoPlano;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getTipoPlano() {
		return tipoPlano;
	}

	public void setTipoPlano(String tipoPlano) {
		this.tipoPlano = tipoPlano;
	}
	
	public String toString() {
		return "Contrato [velocidade=" + velocidade + ", tipoPlano="
				+ tipoPlano + "]";
	}

	public void contratarPlano(String plano){
		tipoPlano = plano;
	}
	
	public void mudarPlano(String novoPlano){
		tipoPlano = novoPlano;
	}
	
	public void cancelarPlano(String planoCancelado){
		tipoPlano = planoCancelado;
	}
	
	public void mudarVelocidade(int num){
		velocidade = num;
	}
	
	
}
