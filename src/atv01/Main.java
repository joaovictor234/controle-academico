package atv01;

import java.util.Scanner;

import atv01.servico.Servico;

public class Main {

	static Servico servico = new Servico();
	
	public static void main(String args[]) {
		
		int acao = 0;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		while(acao != 6) {
			System.out.print("\n\n1 - Registrar curso\n2 - Registrar disciplina\n3- Registrar aluno\n4 - Registrar professor\n5 - Listar tudo\n6 - Sair\n--> ");
			acao = s.nextInt();
			
			switch(acao) {
				case 1:
					servico.registrarCurso();
					break;
				case 2:
					servico.registrarDisciplina();
					break;
				case 3:
					servico.registrarAluno();
					break;
				case 4:
					servico.registrarProfessor();
					break;
				case 5: 
					servico.mostrarDados();
			}
		}
		System.out.println("Você saiu");
	}
	
}
