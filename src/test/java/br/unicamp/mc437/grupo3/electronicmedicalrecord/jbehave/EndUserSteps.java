package br.unicamp.mc437.grupo3.electronicmedicalrecord.jbehave;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EndUserSteps extends ScenarioSteps{
	
	PatientRecordPage page;
	
	@Step
	public void changeValue(String field){
		page.open();
	//open page
	//select field to update the value
	//check is it is non unique
	}
	@Step
	public void setValue(String value, String field){
		page.setValue(value,field);
	}
	@Step
	public void systemShouldAlertAndEnableTheUpdate(){
		
	}
	@Step
	public void systemShouldEnableTheUpdate(){
	
	}

}
