package exercicio;

public class Endereco {
	private String rua;
	private String cidade;
	private String estado;
	
	private void imprimirEndereco() {
		 System.out.println("Endereco:" + rua + " " + cidade + " " + estado );
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
