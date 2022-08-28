package atv01.models;

import java.util.Scanner;

public class Professor{
	
	static int countMatricula = 0;
	
	private String nome; 
	private int matricula;
	private String endereco; 
	private String cpf; 
	private double salario;
	private String titulacao; 
	private String areaPesquisa;
	
	public Professor() {}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSalario() {
		return salario;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public String getAreaPesquisa() {
		return areaPesquisa;
	}
	
	@SuppressWarnings("resource")
	public void lerDados() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Nome do professor: ");
		this.nome = s.nextLine();
		
		System.out.print("endereco do professor: ");
		this.endereco = s.nextLine();
		
		System.out.print("CPF do professor: ");
		this.cpf = s.nextLine();
		
		System.out.print("Salário do professor: ");
		this.salario = s.nextDouble();
		s.nextLine();
		
		System.out.print("Titulação do professor: ");
		this.titulacao = s.nextLine();
		
		System.out.print("Area de pesquisa do professor: ");
		this.areaPesquisa = s.nextLine();
		
		this.matricula = ++countMatricula;
	}
	
	public void mostrarDados() {
		System.out.println("-----------------------------------------------------");
		System.out.println("Nome do professor: " + this.nome);
		System.out.println("Matrícula do professor: " + this.matricula);
		System.out.println("endereco do professor: " + this.endereco);
		System.out.println("CPF do professor: " + this.cpf);
		System.out.println("Salário do professor: " + this.salario);
		System.out.println("Titulação do professor: " + this.titulacao);
		System.out.println("Area de pesquisa do professor: " + this.areaPesquisa);
		System.out.println("-----------------------------------------------------");
	}
}
