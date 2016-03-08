package br.edu.ifpi.associapp.aplicacao;

import br.edu.ifpi.associapp.modelo.*;

public class GerenciaFamilia {

	public static void main(String[] args) {
		
		Familia f = new Familia("WOW", "própria", 5);
		
		f.addPessoa(new Pessoa("Joao", new Data(1990), 'M', "0", "0", 0, "0", "0", "0"));
		f.addPessoa(new Pessoa("Maria", new Data(1990), 'F', "0", "0", 0, "0", "0", "0"));
		
		f.getMembros().get(0).addContato(new Contato("WhatsApp", "99999-9999"));
		f.mostraMembros();
		f.getMembros().get(0).mostraContatos();
	}
}
