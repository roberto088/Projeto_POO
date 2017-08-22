
public class Financeiro extends Cliente{

	private String formaPag;
	private boolean bloqueio;
	
	public Financeiro(String formaPag, boolean bloqueio) {
		this.formaPag = formaPag;
		this.bloqueio = true;
	}

	public String getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(String formaPag) {
		this.formaPag = formaPag;
	}

	public boolean isBloqueio() {
		return bloqueio;
	}
	public void setBloqueio(boolean bloqueio) {
		this.bloqueio = bloqueio;
	}
	
	public String toString() {
		return "Financeiro [formaPag=" + formaPag + ", bloqueio=" + bloqueio
				+ "]";
	}

	public void pagar(){
		
	}
	
	public void ativarContrato(){
		
	}
	
	public void cancelarContrato(){
		
	}
	
	public void pausarContrato(){
		
	}
	
	public void bloquearContrato(){
		
	}
	
	
}
