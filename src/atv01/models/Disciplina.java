package atv01.models;

import java.util.Scanner;

public class Disciplina {
	
	static int countCodigo = 0;
	
	private int codigo;
	private String nome;
	private int carga_horaria;
	private Curso curso;
	private Professor professor;
	
	public Disciplina() {}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getCarga_horaria() {
		return carga_horaria;
	}

	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	@SuppressWarnings("resource")
	public void lerDados() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Nome da disciplina: ");
		this.nome = s.nextLine();
		
		System.out.print("Carga horária da disciplina: ");
		this.carga_horaria = s.nextInt();
		
		this.codigo = ++countCodigo;
	}
	
	public void mostrarDados() {
		System.out.println("-----------------------------------------------------");
		System.out.println("Código da disciplina: " + this.codigo);
		System.out.println("Nome da disciplina: " + this.nome);
		System.out.println("Carga horária da disciplina: " + this.carga_horaria);
		System.out.println("Curso associado: " + curso.getNome());
		System.out.println("Professor: " + professor.getNome());
		System.out.println("-----------------------------------------------------");
	}
	
}
