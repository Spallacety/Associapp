package br.edu.ifpi.associapp.enums;

public enum TipoParentesco {
	PAI(1),
	M�E(2), 
	FILHO(3), 
	FILHA(4), 
	TIO(5),
	TIA(6),
	SOBRINHO(7),
	SOBRINHA(8),
	AV�(9), 
	AV�(10), 
	NETO(11), 
	NETA(12), 
	MADRASTA(13), 
	PADRASTO(14), 
	ENTEADO(15), 
	ENTEADA(16);
	
	private int id;
	
	private TipoParentesco(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
