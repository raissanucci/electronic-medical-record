Narrative:
In order to find patients
As a medic or receptionist
I want to search patients using different filters

Lifecycle:
After:
Outcome: SUCCESS
Given the "Search_Patient" event is inserted on the audit trail

Scenario: Simple search done by the receptionist
Given that the receptionist Laura searches for a patient
And the patient is registered
When she searches for by <field> using the value <value>
Then the system shows a list of users that match the search query

Examples:
|field|value|

Scenario: Simple successful search done by a doctor
Given that the doctor Miguel searches for a patient
And the patient is registered
When he searches by <field> using the value <value>
Then the system shows a list of users that match the search query

Examples:
|field|value|

Scenario: Advanced successful search done by a doctor
Given that the doctor Miguel wants to do an advanced search query
And there are patients that match the query
When he searches by the query <query>
Then the system shows a list of users that match the search query

Examples:
|query|
|name = Jonas AND date >= 21/12/1999|

Scenario: Any search without a result
Given that an user searches for a patient
And the patient is not registered
When he searches by <field> using the value <value>
Then he sees a message "nenhum resultado encontrado"

Examples:
|field|value|

Scenario: Doctor start an appointment after a successful search
Given that the doctor Miguel searched for a patient Jonas
And he wants to start an appointment
And patient Jonas is registered
When he finds the patient Jonas
And chooses to start an appointment
Then the appointment starts
