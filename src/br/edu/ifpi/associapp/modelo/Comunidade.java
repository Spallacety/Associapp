package br.edu.ifpi.associapp.modelo;

import java.util.*;

public class Comunidade {
	
	private String codigo;
	private String nome;
	private String tipo;
	private String cidade;
	private String regiao;
	private List<AptidoesProdutivas> aptidoesProdutivas = new ArrayList<>();
	private String historico;
	private Coordenadas coordenadas;
	private String zona;
	private List<Bens> bens = new ArrayList<>();
	private int indiceDeSeguranca;
	
	
	public static final String URBANA = "Urbana";
	public static final String RURAL = "Rural";
	
	public static final String BAIRRO = "Bairro";
	public static final String POVOADO = "Povoado";
	
	public Comunidade(String nome, String tipo, String cidade, String regiao,
			String historico, String zona, int situacao) {
		this.nome = nome;
		this.tipo = tipo;
		this.cidade = cidade;
		this.regiao = regiao;
		this.historico = historico;
		this.zona = zona;
		this.indiceDeSeguranca = situacao;
		this.codigo = geraCodigo(nome);
	}
	
	private String geraCodigo(String nome){
		String inicio = nome.substring(0, 3).toUpperCase();
		int fim = (int)(Math.random()*1000);
		String cod = inicio + fim;
		return cod;
	}
	
	public void setCoordenadas(Coordenadas coordenadas){
		this.coordenadas = coordenadas;
	}
	
	public void addBens(Bens bem){
		this.bens.add(bem);
	}
	
	public void mostraListaDeBens(){
		for (Bens bem : bens) {
			System.out.println(bem);
		}
	}
	
	public void addAptidoesProdutivas(AptidoesProdutivas aptidoesProdutivas){
		this.aptidoesProdutivas.add(aptidoesProdutivas);
	}
	
	public void mostraListaDeAptidoesProdutivas(){
		for (AptidoesProdutivas aptidoesProdutivas : aptidoesProdutivas) {
			System.out.println(aptidoesProdutivas);
		}
	}
	
	@Override
	public String toString() {
		String str = "Nome da comunidade: " + this.nome + " (" + this.tipo + ", Codigo: " + this.codigo + ")\n"
				+ "Cidade: " + this.cidade + "\nRegiao: " + this.regiao
				+ "\nZona: " + this.zona + "\n[Seguranca: " + this.indiceDeSeguranca + "]";
		return str;
	}
}