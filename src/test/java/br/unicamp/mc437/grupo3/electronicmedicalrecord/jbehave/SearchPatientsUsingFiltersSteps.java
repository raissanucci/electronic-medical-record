package br.unicamp.mc437.grupo3.electronicmedicalrecord.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class SearchPatientsUsingFiltersSteps {
    @Given("that the receptionist $receptionistName searches for a patient")
    public void givenThatTheReceptionistSearchesForAPatient(String receptionistName) {
        System.out.printf("GIVEN THAT THE RECEPTIONIST %S SEARCHES FOR A PATIENT\n", receptionistName);
    }

    @Given("the patient is registered")
    public void givenThatThePatientIsRegistered() {
        System.out.println("AND THE PATIENT IS REGISTERED");
    }

    @When("the receptionist searches for by <field> using the value <value>")
    public void whenTheReceptionistSearchesForByFieldUsingTheValue(@Named("field") String fieldName,
                                                                   @Named("value") String valueInputIntoField) {
        System.out.printf("WHEN THE RECEPTIONIST SEARCHES FOR BY %s USING THE VALUE %s\n", fieldName, valueInputIntoField);
    }

    @Then("the system shows a list of users that match the search query on <field> by <value>")
    public void thenTheSystemShowsAListOfUsersThatMatchTheSearchQueryOnFieldByValue(@Named("field") String fieldName,
                                                                                    @Named("value") String valueInputIntoField) {
        System.out.printf("THEN THE SYSTEM SHOWS A LIST OF USERS THAT MATCH THE QUERY ON %s BY VALUE %s\n", fieldName, valueInputIntoField);
    }
}
