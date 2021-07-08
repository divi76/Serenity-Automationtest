Feature: New user registration and login

  @register
  Scenario Outline: Successful registration  with multiple users
    Given I access the eidcymru landing page
    When I click on access english
    And I click on register
    And I enter the new account details using "<User>","<Email>","<Password>","<ConfirmPassword>"
    And I enter the holding page details using "<CPH>","<Address1>","<Address2>","<Town>","<County>","<Postcode>"
    And I enter the your details using "<Name>","<CRN>","<Landline>","<Mobile>","<Address3>","<Address4>","<Town1>","<County1>","<Postcode1>"
    And I enter the flock details using "<Species>","<Flock>","<Dairy>"
    Then I can see the summary page and click on submit button
    And I can see the confirmation page for account creation

    Examples:
      | User        | Email                  | Password  | ConfirmPassword | CPH         | Address1      | Address2      | Town   | County    | Postcode | Name     | CRN    | Landline     | Mobile      | Address3      | Address4    | Town1  | County1   | Postcode1 | Species | Flock  | Dairy |
      | tester29 | tester29@eidcymru.org | Password@123| Password@123       | 53/999/0029 | 1 Prince Road | Taylor street | London | Middlesex | LD17 5HA | Tester29 | A9098029 | 012345678911 | 07904411111 | 2 Prince Road | Bond street | London | Middlesex | LD18 5HA  | Sheep   | 789029| Dairy |

  @login
  Scenario Outline:Successful Login with multiple users
    Given I am on the application
    When I navigate to Login Page and enter "<User>" "<Password>"

    Examples:
      | User    | Password  |
      | keeperb | Password1 |
      | keepera | Password1 |

  @login
  Scenario Outline:Verify invalid login details
    Given I am on the application
    When login with invalid credentials "<User>" "<Password>"
    Then I should get login error

    Examples:
      | User     | Password    |
      | keeperb1 | Passwoord11 |




