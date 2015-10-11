package br.unicamp.mc437.grupo3.electronicmedicalrecord.jbehave;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;

import br.unicamp.mc437.grupo3.electronicmedicalrecord.steps.ReceptionistSteps;

public class CreatePatientSteps{

	@Steps
	ReceptionistSteps laura;

	// Scenario 1
	@Given("the receptionist Laura is on sign-up patient page")
	public void givenTheReceptionistLauraIsOnSignupPatientPage(){
		laura.enters_page("sign_up");
	}

	@When("the receptionist Laura inserts correct $data into the $field")
	public void whenTheReceptionistLauraInsertsCorrectdataIntoThefield(String data, String field){
		laura.inserir_dado(data, field);
	}

	@Then("the system validates the $field")
	public void thenTheSystemValidatesThefield(String field){
		laura.see_validation(field);
	}

	// Scenario 2
	@Given("the receptionist Laura wants to finish signing up the patient ")
	public void givenTheReceptionistLauraWantsToFinishSigningUpThePatient(){
		laura.enters_page("sign_up");
		laura.finishes_patient();
	}

	@Given("the patient is not yet registered")
	public void givenThePatientIsNotYetRegistered(){
	}

	@Given("all fields are validated")
	public void givenAllFieldsAreValidated(){
		laura.sees_all_fields_as_validated();
	}

	@When("the receptionist Laura selects the finish option")
	public void whenTheReceptionistLauraSelectsTheFinishOption(){
		laura.select_finish_signup();
	}

	@Then("the system creates a new patient in the database")
	@Pending
	public void thenTheSystemCreatesANewPatientInTheDatabase(){
		//TODO
	}

	@Then("shows a success message")
	@Pending
	public void thenShowsASuccessMessage(){
		//TODO
	}

	// Scenario 3

	@Given("the receptionist Laura wants to insert someone")
	@Pending
	public void givenTheReceptionistLauraWantsToInsertSomeone(){
		laura.enters_page("sign_up");
	}

	@Given("the patient is already registered")
	public void givenThePatientIsAlreadyRegistered(){

	}

	@When("the receptionist Laura selects the  create option")
	@Pending
	public void whenTheReceptionistLauraSelectsTheCreateOption(){
		laura.select_finish_signup();
	}

	@Then("the system shows a message informing that the patient already exists ")
	@Pending
	public void thenTheSystemShowsAMessageInformingThatThePatientAlreadyExists(){
		//TODO
	}

	@Then("gives the option to create the register or not")
	@Pending
	public void thenGivesTheOptionToCreateTheRegisterOrNot(){
		//TODO
	}

	// Scenario 4

	@Given("the receptionist Laura wants to create a patient that already exists in the system")
	@Pending
	public void givenTheReceptionistLauraWantsToCreateAPatientThatAlreadyExistsInTheSystem(){
		//TODO
	}

	@Given("the warning message has been shown")
	@Pending
	public void givenTheWarningMessageHasBeenShown(){
		//TODO
	}

	// recepcionist chooses create option
	@Then("the system creates the patient in the database ")
	@Pending
	public void thenTheSystemCreatesThePatientInTheDatabase(){
		//TODO
	}
	// shows sucess message

	// Scenario 5

	@Given("the receptionist Laura is on create patient page")
	@Pending
	public void givenTheReceptionistLauraIsOnCreatePatientPage(){
		laura.enters_page("sign_up");
	}

	@When("the receptionist Laura select insert health insurance and select a health insurance")
	@Pending
	public void whenTheReceptionistLauraSelectInsertHealthInsuranceAndSelectAHealthInsurance(){
		 //TODO
	}


	@Then("the system insert the health insurance into the patient demographic record")
	@Pending
	public void thenTheSystemInsertTheHealthInsuranceIntoThePatientDemographicRecord(){
		 //TODO
	}

	// General

	@Given("the Create_Patient event is inserted on the audit trail")
	@Pending
	public void givenTheCreate_PatientEventIsInsertedOnTheAuditTrail(){
		//TODO
	}
}
