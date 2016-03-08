package br.edu.ifpi.associapp.modelo;

import java.util.ArrayList;
import java.util.List;

public class Gestao {
	
	private int id;
	private String comunidade_id;
	private Data data_inicio;
	private Data data_fim;
	private boolean atual;
	private List<Membro> gestores = new ArrayList<>(); 
}
