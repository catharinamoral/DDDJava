package br.com.fiap.modelo;
public class Curso {
	private String nome;
	private String cargaHoraria;
	private String tipo;
	private Disciplina disciplina;
	
	public String getAll(){
		return "Nome: " + nome + "\n" +
				"Carga Horaria: " + cargaHoraria + "\n" +
				"Tipo: " + tipo + "\n" +
				"Disciplina: " + disciplina.getAll();
	}
	
	public void setAll(String nome, String cargaHoraria, String tipo, Disciplina disciplina) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.tipo = tipo;
		this.disciplina = disciplina;
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
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
}
