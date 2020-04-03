Feature: Create new address

 Scenario Outline: Complete address form
  Given User is in login page
   When User writing email
    And User writing password
    And User logs in to the account
    And Click add a new address
    And Add a new address
    And Fill <alias> input
    And User fill <address> input
    And Add <zip> input
    And Point <city>
    And Check <nationality>
    And Write <phone> input
    And Verify that the data is correct
    Then Close browser

    Examples:
    | alias | address       | zip  | city        | nationality    | phone     |
    | abb   | first street  | 5575 | London      | United Kingdom | 344323452 |
    | ccs   | second street | 5845 | Manchester  | United Kingdom | 344323452 |
    | trs   | third street  | 5235 | Liverpool   | United Kingdom | 344323452 |
    | aws   | fourth street | 1235 | Southampton | United Kingdom | 344323452 |
    | pof   | fifth street  | 5245 | Leicester   | United Kingdom | 344323452 |