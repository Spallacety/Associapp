package br.edu.ifpi.associapp.dao;

import java.util.List;

import br.edu.ifpi.associapp.modelo.Comunidade;

public interface ComunidadeDAO {
	public int inserir (Comunidade c);
	public List<Comunidade> listaComunidade();
	public void remover(int id);
}
