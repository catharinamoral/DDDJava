package br.com.fiap.modelo;
public class Turma {
	private String nome;
	private String periodo;
	private String sala;
	private Curso curso;
	private Aluno alunos;
	
	public String getAll() {
		return "Nome: " + nome + "\n" +
				"Período: " + periodo + "\n" +
				"Sala: " + sala + "\n" +
				"Curso: " + curso + "\n" +
				"Alunos: " + alunos;
	}
	
	public void setAll(String nome, String periodo, String sala, Curso curso, Aluno alunos) {
		this.nome = nome;
		this.periodo = periodo;
		this.sala = sala;
		this.curso = curso;
		this.alunos = alunos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPeriodo() {
		return periodo;
	}
	
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	public String getSala() {
		return sala;
	}
	
	public void setSala(String sala) {
		this.sala = sala;
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public Aluno getAlunos() {
		return alunos;
	}
	
	public void setAlunos(Aluno alunos) {
		this.alunos = alunos;
	}
	
	
}