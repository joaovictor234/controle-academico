package atv01.servico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import atv01.models.Aluno;
import atv01.models.Curso;
import atv01.models.Disciplina;
import atv01.models.Professor;

public class Servico {
	
	final List<Curso> cursos = new ArrayList<Curso>();
	final List<Aluno> alunos = new ArrayList<Aluno>();
	final List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	final List<Professor> professores = new ArrayList<Professor>();
	
	Scanner s = new Scanner(System.in);
	
	static boolean saida = true;
	
	public void registrarCurso() {
		System.out.println("\nRegistrar curso\n");
		Curso curso = new Curso();
		curso.lerDados();
		cursos.add(curso);
	}
	
	public void mostrarCursos() {
		if(cursos.size() != 0) {	
			System.out.println("--------------------");
			System.out.println("|Cursos registrados|");
			System.out.println("--------------------");
			for(Curso c : cursos) {
				c.mostrarDados();
			}
		}
	}
	
	public void mostrarCursosPorNomeECodigo() {
		if(cursos.size() != 0) {	
			System.out.println("--------------------");
			System.out.println("|Cursos registrados|");
			System.out.println("--------------------");
			for(Curso c : cursos) {
				System.out.println("-----------------------------------------------------");
				System.out.println("Curso: " + c.getNome() + " - Código: " + c.getCodigo());
				System.out.println("-----------------------------------------------------");
			}
		}
	}
	
	public Curso pegarCursoPeloCodigo(int codigo) {
		for(Curso c : cursos) {
			if(c.getCodigo() == codigo) {
				saida = false;
				return c;
			}
		}
		return null;
	}
	
	public void registrarProfessor() {
		System.out.println("\nRegistrar professor\n");
		Professor professor = new Professor();
		professor.lerDados();
		professores.add(professor);
	}
	
	public void mostrarProfessores() {
		if(professores.size() != 0) {	
			System.out.println("-------------------------");
			System.out.println("|Professores registrados|");
			System.out.println("-------------------------");
			for(Professor p : professores) {
				p.mostrarDados();
			}
		}
	}
	
	public void mostrarProfessoresPorNomeEMatricula() {
		if(professores.size() != 0) {
			System.out.println("-------------------------");
			System.out.println("|Professores registrados|");
			System.out.println("-------------------------");
			for(Professor p : professores) {
				System.out.println("Professor: " + p.getNome() + " - Código: " + p.getMatricula());
			}
		}
	}
	
	public Professor pegarProfessorPelaMatricula(int matricula) {
		for(Professor p : professores) {
			if(p.getMatricula() == matricula) {
				saida = false;
				return p;
			}
		}
		return null;
	}
	
	public void registrarDisciplina() {
		if(cursos.size() != 0 && professores.size() != 0) {
			System.out.println("\nRegistrar disciplina\n");
			Disciplina disciplina = new Disciplina();
			disciplina.lerDados();
			
			while(saida) {
				System.out.print("curso da disciplina: ");
				int codigoCurso = s.nextInt();
				
				Curso curso = pegarCursoPeloCodigo(codigoCurso);
				if(curso != null) {
					disciplina.setCurso(curso);
				} else {
					System.out.println("\nCurso não encontrado!");
					mostrarCursosPorNomeECodigo();
				}
			}
			
			saida = true;
			
			while(saida) {
				System.out.print("professor da disciplina: ");
				int matriculaProfessor = s.nextInt();
				
				Professor professor = pegarProfessorPelaMatricula(matriculaProfessor);
				if(professor != null) {
					disciplina.setProfessor(professor);
				} else {
					System.out.println("\nProfessor não encontrado!");
					mostrarProfessoresPorNomeEMatricula();
				}
			}
			
			
			disciplinas.add(disciplina);
		} else {
			System.out.println("Não há cursos ou professores registrados para cadastrar um aluno!");
		}
	}
	
	public void mostrarDisciplinas() {
		if(disciplinas.size() != 0) {		
			System.out.println("-------------------------");
			System.out.println("|Disciplinas registradas|");
			System.out.println("-------------------------");
			for(Disciplina d : disciplinas) {
				d.mostrarDados();
			}
		}
	}
	
	public void registrarAluno() {
		if(cursos.size() != 0) {			
			System.out.println("\nRegistrar aluno\n");
			Aluno aluno = new Aluno();
			aluno.lerDados();
			
			saida = true;
			
			while(saida) {
				s.nextLine();
				System.out.print("Curso do aluno: ");
				int codigoCurso = s.nextInt();
				
				Curso curso = pegarCursoPeloCodigo(codigoCurso);
				if(curso != null) {
					aluno.setCurso(curso);
				} else {
					System.out.println("\nCurso não encontrado!");
					mostrarCursosPorNomeECodigo();
				}
			}
			
			alunos.add(aluno);
		} else {
			System.out.println("Não há cursos para registrar o aluno!");
		}
	}

	public void mostrarAlunos() {
		if(alunos.size() != 0) {		
			System.out.println("--------------------");
			System.out.println("|Alunos registrados|");
			System.out.println("--------------------");
			for(Aluno a : alunos) {
				a.mostrarDados();
			}
		}
	}

	public void mostrarDados() {
		mostrarCursos();
		mostrarDisciplinas();
		mostrarProfessores();
		mostrarAlunos();
	}
} 
