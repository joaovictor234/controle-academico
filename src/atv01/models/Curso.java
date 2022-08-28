package atv01.models;

import java.util.Scanner;

public class Curso {
	
	static int countCodigo = 0;
	
	private int codigo;
	private String nome;
	
	public Curso() {}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	@SuppressWarnings("resource")
	public void lerDados() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite o nome do curso: ");
		this.nome = s.nextLine();
		
		this.codigo = ++countCodigo;
	}
	
	public void mostrarDados() {
		System.out.println("-----------------------------------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Código: " + this.codigo);
		System.out.println("-----------------------------------------------------");
	}
}
