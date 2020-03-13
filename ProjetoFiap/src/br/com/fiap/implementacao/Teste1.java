package br.com.fiap.implementacao;

import javax.swing.JOptionPane;

import br.com.fiap.modelo.Endereco;
import br.com.fiap.modelo.Professor;

public class Teste1 {

	public static void main(String[] args) {
		
		Professor churros = new Professor();
		
		
		churros.setNome(JOptionPane.showInputDialog("Digite o nome"));
		churros.setApelido("ChupChup");
		
		Endereco e = new Endereco();
		
		e.setBairro("Aclimação");
		e.setCep("03322-060");
		e.setCidade("São Paulo");
		e.setLogradouro("Av. Lins");
		e.setNumero("1222");
		e.setUf("SP");
		
		churros.setEndereco(e);
		
		System.out.println(churros.getTudo());
		
		
	}

}
