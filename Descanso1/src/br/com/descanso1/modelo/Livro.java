package br.com.descanso1.modelo;

public class Livro {
	private String nome;
	private Autor autor;
	private String anoPublicado;
	private double preco;
	private Editora editora;
	private int estoque;
	
	public String getAll() {
		return "Nome: " + nome + "\n" +
				"Autor: " + autor + "\n" +
				"Ano publicado: " + anoPublicado + "\n" +
				"Preço: R$" + preco + "\n" +
				"Editora: "  + editora + "\n" +
				"Estoque: " + estoque ;
	}
	
	public void setAll(String n, Autor autor, String ano, double preco, Editora edi, int estoq) {
		nome = n;
		this.autor = autor;
		anoPublicado = ano;
		this.preco = preco;
		editora = edi;
		estoque = estoq;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String getAnoPublicado() {
		return anoPublicado;
	}
	public void setAnoPublicado(String anoPublicado) {
		this.anoPublicado = anoPublicado;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
	
}
