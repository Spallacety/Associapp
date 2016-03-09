package br.edu.ifpi.associapp.dao;

import java.util.List;

import br.edu.ifpi.associapp.modelo.Gestor;

public interface GestorDAO {
	public Gestor inserirGestor(Gestor  g);
	public Gestor retornarGestorPorId(int id);
	public void removerGestor(int id);
	public List<Gestor> listaGestores();
	public List<Gestor> BuscarPorNome(String nome);
}
