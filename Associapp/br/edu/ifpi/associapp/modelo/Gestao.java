package br.edu.ifpi.associapp.modelo;

import java.util.ArrayList;
import java.util.List;

public class Gestao {
	
	private int id;
	private int id_comunidade;
	private String nome;
	private int inicio;
	private int fim;
	private boolean atual;
	private Gestor lider;
	private List<Gestor> gestores = new ArrayList<>();
	
	
	@Override
	public String toString() {
		return "Nome da gestao: " + this.nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_comunidade() {
		return id_comunidade;
	}
	public void setId_comunidade(int id_comunidade) {
		this.id_comunidade = id_comunidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getInicio() {
		return inicio;
	}
	public void setInicio(int inicio) {
		this.inicio = inicio;
	}
	public int getFim() {
		return fim;
	}
	public void setFim(int fim) {
		this.fim = fim;
	}
	public boolean isAtual() {
		return atual;
	}
	public void setAtual(boolean atual) {
		this.atual = atual;
	}
	public Gestor getLider() {
		return lider;
	}
	public void setLider(Gestor lider) {
		this.lider = lider;
	}
	public List<Gestor> getGestores() {
		return gestores;
	}
	public void setGestores(List<Gestor> gestores) {
		this.gestores = gestores;
	}
	
	

}
