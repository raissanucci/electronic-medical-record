package br.unicamp.mc437.grupo3.electronicmedicalrecord.steps;

import br.unicamp.mc437.grupo3.electronicmedicalrecord.pages.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class ReceptionistSteps {
	List<String> fields;
	List<String> datas;
	Map<String, String> registered;
	CreatePage createpage;

	public ReceptionistSteps() {
		registered = new HashMap<String, String>();
		registered.put("name", "Jose de Souza");
		registered.put("socialName", "Raissa");
		registered.put("mothersName", "Andreia Terron");
		registered.put("fathersName", "Victor Accarini");
		registered.put("gender", "male");
		registered.put("color", "white");
		registered.put("birthdate", "06/01/1992");
		registered.put("bloodtype", "B+");
		registered.put("email", "raissafazniver@sabado.com");
		registered.put("cpf", "27444273812");
		registered.put("rg", "403289440");
		registered.put("orgEmissor", "SSP");
		registered.put("orgEmissorUF", "SP");
		registered.put("ddd", "11");
		registered.put("phone", "98834556");
		registered.put("zip", "02546000");
		registered.put("address", "Av Engenheiro Caetano Álvares");
		registered.put("addressNumber", "1789");
		registered.put("addressComplement", "");
		registered.put("addressCityArea", "Limão");
		registered.put("addressCity", "São Paulo");
		registered.put("addressUF", "SP");
		registered.put("addressCountry", "Brasil");
		fields = new ArrayList<String>();
		datas = new ArrayList<String>();
		fields.add("name");
		fields.add("socialName");
		fields.add("mothersName");
		fields.add("fathersName");
		fields.add("gender");
		fields.add("color");
		fields.add("birthdate");
		fields.add("bloodtype");
		fields.add("email");
		fields.add("cpf");
		fields.add("rg");
		fields.add("orgEmissor");
		fields.add("orgEmissorUF");
		fields.add("ddd");
		fields.add("phone");
		fields.add("zip");
		fields.add("address");
		fields.add("addressNumber");
		fields.add("addressComplement");
		fields.add("addressCityArea");
		fields.add("addressCity");
		fields.add("addressUF");
		fields.add("addressCountry");
		datas.add("Jose da Silva");
		datas.add("Raissa");
		datas.add("Andreia Terron");
		datas.add("Victor Accarini");
		datas.add("male");
		datas.add("white");
		datas.add("04/10/1994");
		datas.add("AB+");
		datas.add("raissafazniver@domingo.com");
		datas.add("27444273812");
		datas.add("403289440");
		datas.add("SSP");
		datas.add("SP");
		datas.add("11");
		datas.add("98834556");
		datas.add("02546000");
		datas.add("Av Engenheiro Caetano Álvares");
		datas.add("1789");
		datas.add("");
		datas.add("Limão");
		datas.add("São Paulo");
		datas.add("SP");
		datas.add("Brasil");
	}

	public void enters_page (String page) {
		createpage.open();
	}

	public void inserir_dado (String data, String field) {
		createpage.insert(data, field);
	}

	public void see_validation (String field) {
		assertTrue(createpage.validate(field));
	}

	public void user_already_registered() {
		assertTrue(true);
	}

	public void sees_all_fields_as_validated() {
		for (String field: fields) {
			assertTrue(createpage.validate(field));
		}
	}

	public void insert_registered_patient_data() {
		createpage.insert("", "");
	}

	public void select_finish_signup() {
		createpage.click_signup_btn();
	}

	public void finishes_patient() {
		for (int i = 0; i < fields.size(); i++) {
			createpage.insert(datas.get(i), fields.get(i));
		}
	}

}
