package br.com.fiap.modelo;

public class Disciplina {
	private String nome;
	private String cargaHoraria;
	private String ementa;
	private Professor professor;
	
	public String getAll() {
		return "Nome: " + nome+ "\n" +
				"Carga Horaria: " + cargaHoraria + "\n" +
				"Ementa: " + ementa + "\n" +
				"Professor: " + professor.getTudo();
	}
	
	public void setAll(String nome, String cargaHoraria, String ementa, Professor professor) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.ementa = ementa;
		this.professor = professor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getEmenta() {
		return ementa;
	}
	
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
}