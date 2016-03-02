package br.edu.ifpi.associapp.modelo;

import br.edu.ifpi.associapp.enums.TipoParentesco;

public class Parentesco {
	
	private Pessoa pessoa;
	private TipoParentesco parentesco;
	
	
	public Parentesco(Pessoa pessoa, TipoParentesco parentesco){
		this.pessoa = pessoa;
		this.parentesco = parentesco;
		
		
		new Parentesco(this.pessoa, parentesco);
		
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public TipoParentesco getParentesco() {
		return parentesco;
	}
	public void setParentesco(TipoParentesco parentesco) {
		this.parentesco = parentesco;
	}	
	
}
