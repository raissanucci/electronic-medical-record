package br.unicamp.mc437.grupo3.electronicmedicalrecord.steps;

import br.unicamp.mc437.grupo3.electronicmedicalrecord.pages.*;
public class ReceptionistSteps {

	CreatePage createpage;
	public void enters_page (String page) {
		createpage.open();
	}
	
	public void inserir_dado (String data, String field) {
		createpage.insert(data, field);
	}
}
