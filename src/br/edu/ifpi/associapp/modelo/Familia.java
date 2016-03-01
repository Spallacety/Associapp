package br.edu.ifpi.associapp.modelo;

import java.util.*;

public class Familia {
	
	private String codigo;
	private List<Membro> membros = new ArrayList<>();
	private Membro chefe;
	private String descricao;
	private String situacaoDaCasa;
	private List<Recursos> recursos = new ArrayList<>();
	private int seguranca;
	
	public Familia(String descricao, String situacaoDaCasa, int seguranca) {
		this.descricao = descricao;
		this.situacaoDaCasa = situacaoDaCasa;
		this.seguranca = seguranca;
	}
	
	public void addMembro(Membro membro){
		this.membros.add(membro);
	}
	
	public void mostraMembros(){
		for (Membro membro : membros) {
			System.out.println(membro);
		}
	}

	public List<Membro> getMembros() {
		return membros;
	}
	
	private String geraCodigo(String nome){
		String inicio = nome.substring(0, 3).toUpperCase();
		int fim = (int)(Math.random()*1000);
		String cod = inicio + fim;
		return cod;
	}
	
}
