package exercicio;

import java.util.ArrayList;

public class Aluno extends Pessoa {
	private Curso curso;
	private ArrayList<Double> notas;
	public double calcularMedia() {
		return 0.00;
	}
	
	private void imprimir() {
		 System.out.println("Curso e notas:" + curso + " " + notas);
	}
	
}
