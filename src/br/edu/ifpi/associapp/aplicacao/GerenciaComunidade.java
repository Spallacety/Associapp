package br.edu.ifpi.associapp.aplicacao;

import br.edu.ifpi.associapp.modelo.*;

public class GerenciaComunidade {

	public static void main(String[] args) {
		
		Comunidade c = new Comunidade("IFPI", Comunidade.BAIRRO, "Teresina", "Norte", "0", Comunidade.URBANA, 4);
		
		c.addBens(new Bens("Praca da Liberdade", Bens.PRACA, 5));
		c.addAptidoesProdutivas(new AptidoesProdutivas("Bar do Seu Zé", AptidoesProdutivas.BAR));
		System.out.println(c);
		c.mostraListaDeBens();
		c.mostraListaDeAptidoesProdutivas();
		
	}
}
