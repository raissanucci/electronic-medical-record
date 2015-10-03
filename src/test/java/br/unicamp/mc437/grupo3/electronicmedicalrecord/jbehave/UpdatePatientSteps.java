package br.unicamp.mc437.grupo3.electronicmedicalrecord.jbehave;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
public class UpdatePatientSteps{
	
	@Steps
	EndUserSteps endUser;
	
	@Given("that the receptionist Laura wants to change the value of a non-unique $field")
	@Pending
	public void givenThatTheReceptionistLauraWantsToChangeTheValueOfANonuniquefield(String field){
		 endUser.changeValue(field);
	}
	@Then("the system alerts her about the possible mistake but, nonetheless, allows her to create a new demographic record that is then linked to the unique id of the patient as its current state, maintaining the former record accessible. After all, the system registers the modification at the audit trail.")
	@Pending
	public void thenTheSystemAlertsHerAboutThePossibleMistakeButNonethelessAllowsHerToCreateANewDemographicRecordThatIsThenLinkedToTheUniqueIdOfThePatientAsItsCurrentStateMaintainingTheFormerRecordAccessibleAfterAllTheSystemRegistersTheModificationAtTheAuditTrail(){
		 endUser.systemShouldAlertAndEnableTheUpdate(); 
	}
	@When("she inserts the new  $value in the $field and saves the changes")
	@Pending
	public void whenSheInsertsTheNewvalueInThefieldAndSavesTheChanges(String value, String field){
		 endUser.setValue(value, field); 
	}
	@Then("the system creates a new demographic record and links to the unique id of the patient as its current state, maintaining the former record accessible. After all, the system registers the modification at the audit trail.")
	@Pending
	public void thenTheSystemCreatesANewDemographicRecordAndLinksToTheUniqueIdOfThePatientAsItsCurrentStateMaintainingTheFormerRecordAccessibleAfterAllTheSystemRegistersTheModificationAtTheAuditTrail(){
		endUser.systemShouldEnableTheUpdate(); 
	}
	@Given("that the receptionist Laura wants to change the value of a pseudo-unique $field")
	@Pending
	public void givenThatTheReceptionistLauraWantsToChangeTheValueOfAPseudouniquefield(String field){
		endUser.changeValue(field);
	}
}