Narrative:
In order to see the basic information of a patient
As a receptionist or doctor
I want to be able to see the patient sign-up information

Lifecycle:
After:
Outcome: SUCCESS
Given the "View_Patient" event is inserted on the audit trail

Scenario: View patient as receptionist
Given that the receptionist Laura wants to see the patient's details
When the patient is selected
Then the system shows the patient's demographic informations

Scenario: View patient details as a doctor
Given that the doctor Miguel wants to see the patient's details
When the patient is selected
Then the system shows a detailed summary of the patient information
