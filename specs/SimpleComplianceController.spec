SIMPLE COMPALIANCE CONTROLLER
=========

Tester le controleur
-----------------------------------

* get main endpoint "ENDPOINT_MAIN"
* then the status of "ENDPOINT_MAIN" equals "200"

Tester le controleur avec un parametre
-----------------------------------

* get main endpoint "ENDPOINT_MAIN" with parameter in
    |parameter           |
    |---------------|
    |Jean           |
* then the status of "ENDPOINT_MAIN" equals "200"
* then the content of "ENDPOINT_MAIN" equals "Hello Jean"
