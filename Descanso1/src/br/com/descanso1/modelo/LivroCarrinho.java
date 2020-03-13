package br.com.descanso1.modelo;

public class LivroCarrinho {
	private Livro livro;
	private Envio envio;
	private int quantidade;
	
	public String getAll() {
		return "Livro: " + livro + "\n" +
				"Quantidade: " + quantidade + "\n" +
				"Envio: " + envio ;
	}
	
	public void setAll(Livro li, Envio env, int quant) {
		livro = li;
		envio = env;
		quantidade = quant;
	}
	
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Envio getEnvio() {
		return envio;
	}
	public void setEnvio(Envio envio) {
		this.envio = envio;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
