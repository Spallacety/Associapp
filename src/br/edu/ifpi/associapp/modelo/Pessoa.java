package br.edu.ifpi.associapp.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private int id;
	private int id_familia;
	private String nome;
	private Data dataDeNascimento;
	private char sexo;
	private String profissao;
	private String situacaoLaboral;
	private double rendaMediaMensal;
	private String religiao;
	private String timeDeFutebol;
	private String grauDeInstrucao;
	private Parentesco parentesco;
	private List<Contato> contatos = new ArrayList<>();
	
	public Pessoa(String nome, Data dataDeNascimento, char sexo, String profissao, String situacaoLaboral, double rendaMediaMensal,
			String religiao, String timeDeFutebol, String grauDeInstrucao) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.profissao = profissao;
		this.situacaoLaboral = situacaoLaboral;
		this.rendaMediaMensal = rendaMediaMensal;
		this.religiao = religiao;
		this.timeDeFutebol = timeDeFutebol;
		this.grauDeInstrucao = grauDeInstrucao;
	}
	
	public void addContato(Contato contato){
		this.contatos.add(contato);
	}
	
	public void mostraContatos(){
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
	}
	
	@Override
	public String toString() {
		String str = "Nome: " + this.nome + "\nData de nascimento: " + this.dataDeNascimento + "\nSexo: " +this.sexo + "\n\n";
		return str;
	}
	
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Parentesco getParentesco() {
		return parentesco;
	}

	public void setParentesco(Parentesco parentesco) {
		this.parentesco = parentesco;
	}
}
