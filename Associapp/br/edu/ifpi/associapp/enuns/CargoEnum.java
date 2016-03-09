package br.edu.ifpi.associapp.enuns;

public enum CargoEnum {
	
	PRESIDENTE("Presidente"),
	VICE_PRESIDENTE("Vice presidente"),
	TESOREIRO("Tesoreiro"),
	SECREARIO("Secretário");
	
	private String id;

	private CargoEnum(String id) {
		this.id = id;
	}
	public String getId(){
		return id;
	}
	
	public static String retornaValores() {
		return "1- PRESIDENTE\n"
				+ "2-VICE PRESIDENTE\n"
				+ "3- TESOUREIRO\n"
				+ "4-SECRETARIO";
	}
	

}
