Narrative:
In order to provide service to a patient
As a receptionist
I want to be able to insert a new patient

Lifecycle:
After:
Outcome: SUCCESS
Given the Create_Patient event is inserted on the audit trail

Scenario:  Filling up the patient sign-up page
Given the receptionist Laura is on sign-up patient page
When the receptionist Laura inserts correct [data] into the [field]
Then the system validates the [field]

Examples:
|data|field|
|Jose da Silva|name|
|Raissa|socialName|
|Andreia Terron|mothersName|
|Victor Accarini|fathersName|
|Avenida das Flores|gender|
|white|color|
|04/10/1994|birthdate|
|AB+|bloodtype|
|raissafazniver@domingo.com|email|
|27444273812|cpf|
|403289440|rg|
|SSP|orgEmissor|
|SP|orgEmissorUF|
|11|ddd|
|98834556|phone|
|02546000|zip|
|Av Engenheiro Caetano Álvares|address|
|1789|addressNumber|
||addressComplement|
|Limão|addressCityArea|
|São Paulo|addressCity|
|SP|addressUF|
|Brasil|addressCountry|

Scenario:  Finishing signing up a patient that doesn't exist
Given the receptionist Laura wants to finish signing up the patient 
And the patient is not yet registered
And all fields are validated
When the receptionist Laura selects the finish option
Then the system creates the patient in the database 
And shows a success message

Scenario: Finishing signing up a patient that does exist
Given the receptionist Laura wants to insert someone
And the patient is already registered
When the receptionist Laura selects the finish option
Then the system shows a message informing that the patient already exists 
And gives the option to create the register or not

Scenario: Choosing to create patient that already exists
Given the receptionist Laura wants to create a patient that already exists in the system
And the warning message has been shown
When the receptionist Laura selects the  create option
Then the system creates a new patient in the database
And shows a success message

Scenario: Inserting patient health insurance
Given the receptionist Laura is on create patient page
When the receptionist Laura select insert health insurance and select a health insurance
Then the system insert the health insurance into the patient demographic record
