
public class OrdemServico extends Cliente{
	
	private int num;
	private String motivo;
	
	public OrdemServico(int num, String motivo) {
		this.num = 0;
		this.motivo = "Sem Ordens";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num++;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String toString() {
		return "OrdemServico [num=" + num + ", motivo=" + motivo + "]";
	}

	public void criarOrdem(){
		
	}

	public void fecharOrdem(){
		
	}
	
	public void cancelarOrdem(){
		
	}
	
}
