package exercicio;

import java.util.ArrayList;

public class Professor extends Pessoa{
	private String titulacao;
	private double salario;
	private ArrayList<Curso> cursos;
	
	private void imprimir() {
		 System.out.println("Titulacao, salario e curso:" + titulacao + " " + salario + " " + cursos);
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
}
