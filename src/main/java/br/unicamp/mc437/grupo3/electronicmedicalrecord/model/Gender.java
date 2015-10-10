package br.unicamp.mc437.grupo3.electronicmedicalrecord.model;

public enum Gender {
	MASCULINO("M", "Masculino"),
	FEMININO("F", "Feminino"),
	IGNORADO("I", "Ignorado");
	
	private String code;
	private String gender;
	
	private Gender(String code, String gender) {
		this.code = code;
		this.gender = gender;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getGender() {
		return gender;
	}
	
	public static Gender findGenderByIndex(int n) {
		for (Gender gender : Gender.values()) {
			if (gender.ordinal() == n) {
				return gender;
			}
		}
		return null;
	}

	public static Gender findGenderByCode(String code) {
		for (Gender gender : Gender.values()) {
			if (gender.getCode().toUpperCase().equals(code.toUpperCase())) {
				return gender;
			}
		}
		return null;
	}
}
