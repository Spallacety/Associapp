package br.edu.ifpi.associapp.modelo;

public class Bens {
	
	private String nome;
	private String tipo;
	private int situacao;
	
	public static final String PRACA = "Praça";
	
	public Bens(String nome, String tipo, int situacao) {
		this.nome = nome;
		this.tipo = tipo;
		this.situacao = situacao;
	}
	
	@Override
	public String toString() {
		return this.nome + " (" + this.tipo + ") " + "[Situacao: " + this.situacao + "]";
	}
}
