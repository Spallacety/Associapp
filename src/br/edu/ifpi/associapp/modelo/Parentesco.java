package br.edu.ifpi.associapp.modelo;

public class Parentesco {

	public enum Parentescos{
		PAI, MÃE, FILHO, FILHA, TIO, SOBRINHO, AVÔ, AVÓ, NETO, NETA, MADRASTA, PADRASTO, ENTEADO, ENTEADA;
	}
	
	private Membro pessoa;
	private String parentesco;
	
	public Parentesco(Membro pessoa, String parentesco){
		this.pessoa = pessoa;
		this.parentesco = parentesco;
	}

	public Membro getPessoa() {
		return pessoa;
	}

	public void setPessoa(Membro pessoa) {
		this.pessoa = pessoa;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	
	
}
