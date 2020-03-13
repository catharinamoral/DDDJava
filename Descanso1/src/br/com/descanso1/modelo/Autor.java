package br.com.descanso1.modelo;

public class Autor {
	private String nome;
	private String sobrenome;
	
	public String getAll() {
		return "Nome: " + nome + ", sobrenome: " + sobrenome;
	}
	
	public void setAll(String n, String s) {
		nome = n;
		sobrenome = s;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
}
