Scenario:  Signing a patient up in the system
Given Jose came for a first time appointment
When the receptionist Laura selects to insert a new patient
Then the system opens up a sign-up patient page

Scenario:  Filling up the patient sign-up page
Given the receptionist Laura is on sign-up patient page
When the receptionist Laura inserts correct [data] into the [field]
Then the system validates the [field]

!-- Put all information provided by Laura to the system in the When
Examples:
|data|field|
|Jose da Silva|name|
|10/02/1960|dateofbirth|
|1234567657|cpf|
|872648769|rg|
|Avenida das Flores|endereco|
|MedSul|planodesaude|

Scenario:  Finishing signing up the patient
Given the receptionist Laura wants to finish signing up the patient and all field are validated
When the receptionist Laura selects the finish option
Then the system creates the patient in the database and shows a success message


