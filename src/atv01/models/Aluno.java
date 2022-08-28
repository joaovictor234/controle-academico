package atv01.models;

import java.util.Scanner;

public class Aluno {

	static int countMatricula = 0;
	
	private String nome;
	private int matricula;
	private String cpf;
	private String endereco;
	private Curso curso;
	
	public Aluno() {}
	
	public Curso getCurso() {
		return this.curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@SuppressWarnings("resource")
	public void lerDados() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		this.nome = s.nextLine();
		
		System.out.print("Digite o cpf do aluno: ");
		this.cpf = s.nextLine();
		
		System.out.print("Digite o endereco do aluno: ");
		this.endereco = s.nextLine();
		
		this.matricula = ++countMatricula;
		
	}
	
	public void mostrarDados() {
		System.out.println("-----------------------------------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Curso: " + curso.getNome());
		System.out.println("-----------------------------------------------------");
	}
	
}
