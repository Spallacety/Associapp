package br.edu.ifpi.associapp.modelo;

public class Endereco {

	private String rua;
	private int numero;
	private String complemento;
	private String cep;
	
	public Endereco(String rua, int numero, String cep){
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
	}
	
	public Endereco(String rua, int numero, String cep, String complemento){
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.complemento = complemento;
	}
	
	@Override
	public String toString() {
		if (this.complemento == null){
			return this.rua + ", N.º " + this.numero + ", CEP " + this.cep; 
		} else{
			return this.rua + ", N.º " + this.numero + ", CEP " + this.cep + " (" + this.complemento + ")"; 
		}
	}
}
