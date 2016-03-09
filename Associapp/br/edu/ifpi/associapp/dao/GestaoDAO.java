package br.edu.ifpi.associapp.dao;

import java.util.List;

import br.edu.ifpi.associapp.modelo.Gestao;

public interface GestaoDAO {
	public Gestao adicionarGEstao(Gestao gestao);
	public Gestao retornarGestaorPorId(int id);
	public void removerGestao(int id);
	public List<Gestao> listaGestao();
	public List<Gestao> BuscarPorNome(String nome);
}
