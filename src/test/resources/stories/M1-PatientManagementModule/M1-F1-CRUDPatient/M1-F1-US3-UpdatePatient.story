Narrative:
In order to keep the patient record up-to-date
As a receptionist
I want to be able to update a patient record

Lifecycle:
After:
Outcome: SUCCESS
Given the "Update_Patient" event is inserted on the audit trail

Scenario: Editing a non-unique patient information
Given that the receptionist Laura wants to change the value of a non-unique <field>
When she inserts the new  <value> in the <field> and saves the changes
Then the system creates a new demographic record and links to the unique id of the patient as its current state, maintaining the former record accessible. After all, the system registers the modification at the audit trail.

Examples:
|value|field|
|Jose da Silva|name|
|Solteiro|marital status|
|Rua da Quitanda, 947|address|

Scenario: Editing a pseudo-unique patient information
Given that the receptionist Laura wants to change the value of a pseudo-unique <field>
When she inserts the new  <value> in the <field> and saves the changes
Then the system alerts her about the possible mistake but, nonetheless, allows her to create a new demographic record that is then linked to the unique id of the patient as its current state, maintaining the former record accessible. After all, the system registers the modification at the audit trail.

Examples:
|value|field|
|123.456.789-00|CPF|
|12.345.678-9|RG|