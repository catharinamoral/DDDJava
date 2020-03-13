package br.com.descanso1.modelo;

public class Cliente {
	
	private TipoCliente tipoCliente;
	private String nomeFisica;
	private String nomeJuridico;
	private String email;
	private int telefonePesoal;
	private int telefoneComercial;
	private int cpfCnpj;
	private Endereco enderecoCobranca;
	private Endereco enderecoEntrega;
	
	public String getAll() {
		return "Tipo cliente: " + tipoCliente + "\n" +
				"Nome fisico: " + nomeFisica + "\n" +
				"Nome juridico: " + nomeJuridico + "\n" +
				"Email: " + email + "\n" +
				"Telefone pessoal: " + telefonePesoal + "\n" +
				"Telefone comercial: " + telefoneComercial + "\n" +
				"CPF/CNPJ: " + cpfCnpj + "\n" +
				"Endereço cobrança: " + enderecoCobranca + "\n" +
				"Endereço entrega: " + enderecoEntrega;
	}
	
	
	public void setAll(TipoCliente tipoCliente, String nf, String nj, String e, int tp, int tc, int cpcn, Endereco ec, Endereco ee) {
		this.tipoCliente = tipoCliente;
		nomeFisica = nf;
		nomeJuridico = nj;
		email = e;
		telefonePesoal = tp;
		telefoneComercial = tc;
		cpfCnpj = cpcn;
		enderecoCobranca = ec;
		enderecoEntrega = ee;
	}
	
	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}
	
	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	public String getNomeFisica() {
		return nomeFisica;
	}
	
	public void setNomeFisica(String nomeFisica) {
		this.nomeFisica = nomeFisica;
	}
	
	public int getTelefonePesoal() {
		return telefonePesoal;
	}
	
	public void setTelefonePesoal(int telefonePesoal) {
		this.telefonePesoal = telefonePesoal;
	}
	
	public int getCpfCnpj() {
		return cpfCnpj;
	}
	
	public void setCpfCnpj(int cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	
	public Endereco getEnderecoCobranca() {
		return enderecoCobranca;
	}
	
	public void setEnderecoCobranca(Endereco enderecoCobranca) {
		this.enderecoCobranca = enderecoCobranca;
	}
	
	public String getNomeJuridico() {
		return nomeJuridico;
	}
	
	public void setNomeJuridico(String nomeJuridico) {
		this.nomeJuridico = nomeJuridico;
	}
	
	public int getTelefoneComercial() {
		return telefoneComercial;
	}
	
	public void setTelefoneComercial(int telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}
	
	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}
	
	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	} 
}
