package br.edu.ifpi.associapp.modelo;

public class AptidoesProdutivas {

	private String nome;
	private String tipo;
	
	public static final String BAR = "Bar";
	
	public AptidoesProdutivas(String nome, String tipo){
		this.nome = nome;
		this.tipo = tipo;
	}
	
	@Override
	public String toString(){
		return this.nome + " (" + this.tipo + ")";
	}
}
