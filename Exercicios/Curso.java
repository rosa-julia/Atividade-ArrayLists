package exercicio;

public class Curso {
	private String nome;

	private void imprimirCurso() {
		 System.out.println("Curso:" + nome );
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
