package exercicio;

public class Telefone {
	private String tipo;
	private String ddd;
	private String numero;
	
	private void imprimirTelefone() {
		 System.out.println("Numero de telefone ddd e numero:" + ddd + " " + numero );
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
