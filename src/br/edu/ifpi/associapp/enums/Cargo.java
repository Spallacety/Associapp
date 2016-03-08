package br.edu.ifpi.associapp.enums;

public enum Cargo {
	PRESIDENTE(1),
	VICE_PRESIDENTE(2),
	TESOUREIRO(3),
	SECRETARIO(4);
	
	private int id;

	private Cargo(int id) {
		this.id = id;
	}

//	public static Cargo fromInterger(int i){
//		switch(i){
//		case 1:
//			
//		}
//	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
