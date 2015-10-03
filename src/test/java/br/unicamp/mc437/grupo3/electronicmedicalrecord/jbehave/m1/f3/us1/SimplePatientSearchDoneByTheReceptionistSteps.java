package br.unicamp.mc437.grupo3.electronicmedicalrecord.jbehave.m1.f3.us1;

import org.jbehave.core.annotations.*;

public class SimplePatientSearchDoneByTheReceptionistSteps {
    @Given("that the receptionist $receptionistName searches for a patient")
    @Pending
    public void givenThatTheReceptionistSearchesForAPatient(String receptionistName) {
    }

    @Given("the patient is registered")
    @Pending
    public void givenThatThePatientIsRegistered() {
    }

    @When("the receptionist searches for by <field> using the value <value>")
    @Pending
    public void whenTheReceptionistSearchesForByFieldUsingTheValue(@Named("field") String fieldName,
                                                                   @Named("value") String valueInputIntoField) {
    }

    @Then("the system shows a list of users that match the search query on <field> by <value>")
    @Pending
    public void thenTheSystemShowsAListOfUsersThatMatchTheSearchQueryOnFieldByValue(@Named("field") String fieldName,
                                                                                    @Named("value") String valueInputIntoField) {
    }
}
