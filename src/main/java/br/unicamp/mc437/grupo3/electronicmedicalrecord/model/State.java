package br.unicamp.mc437.grupo3.electronicmedicalrecord.model;

public enum State {    	
	ACRE("AC","Acre"),
	ALAGOAS("AL","Alagoas"),
	AMAZONAS("AM","Amazonas"),
	AMAPA("AP","Amapa"),
	BAHIA("BA","Bahia"),
	CEARA("CE","Ceara"),
	DISTRITO_FEDERAL("DF","Distrito Federal"),
	ESPIRITO_SANTO("ES","Espirito Santo"),
	GOIAS("GO","Goias"),
	MARANHAO("MA","Maranhao"),
	MINAS_GERAIS("MG","Minas Gerais"),
	MATO_GROSSO_DO_SUL("MS","Mato Grosso do Sul"),
	MATO_GROSSO("MT","Mato Grosso"),
	PARA("PA","Para"),
	PARAIBA("PB","Paraiba"),
	PERNAMBUCO("PE","Pernambuco"),
	PIAUI("PI","Piaui"),
	PARANA("PR","Parana"),
	RIO_DE_JANEIRO("RJ","Rio de Janeiro"),
	RIO_GRANDE_DO_NORTE("RN","Rio Grande do Norte"),
	RONDONIA("RO","Rondonia"),
	RORAIMA("RR","Roraima"),
	RIO_GRANDE_DO_SUL("RS","Rio Grande do Sul"),
	SANTA_CATARINA("SC","Santa Catarina"),
	SERGIPE("SE","Sergipe"),
	SAO_PAULO("SP","Sao Paulo"),
	TOCANTINS("TO","Tocantins");

	
	private String acronym;
	private String name;
	
	private State(String acronym, String name) {
		this.acronym = acronym;
		this.name = name;
	}
	
	public String getAcronym() {
		return acronym;
	}
	
	public String getName() {
		return name;
	}
	
	public static State findStateByIndex(int n) {
		for (State state : State.values()) {
			if (state.ordinal() == n) {
				return state;
			}
		}
		return null;
	}
}
