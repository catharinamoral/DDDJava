package br.com.fiap.modelo;

public class Professor {
	private String nome;
	private String apelido;
	private Endereco endereco;
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setTudo(String n, String a) {
		nome=n;
		apelido=a;
	}

	public String getTudo() {
		return "Nome......:" + nome + "\n" + 
				"Apelido..:" + apelido + "\n" + 
				"Endereço.:" + endereco.getTudo();
				
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}


}
