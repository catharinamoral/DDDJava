package br.com.descanso1.modelo;

public class Editora {
	private String nome;
	private String cnpj;
	private String telefone;
	
	public String getAll() {
		return "Nome......:" + nome + "\n" + 
				"Cnpj..:" + cnpj + "\n" + 
				"Telefone.:" + telefone;
	}
	
	public void setAll(String n, String c, String t ) {
		nome = n;
		cnpj = c;
		telefone = t;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
