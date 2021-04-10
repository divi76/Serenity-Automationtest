@login
Feature: Login feature

  Scenario Outline:Successful Login with multiple users
    Given I am on the application
    When I navigate to Login Page and enter "<User>" "<Password>"

    Examples:
      | User    | Password  |
      | keeperb | Password1 |
      | keepera | Password1 |

  Scenario Outline:Verify invalid login details
    Given I am on the application
    When login with invalid credentials "<User>" "<Password>"
    Then I should get login error

    Examples:
      | User    | Password  |
      | keeperb1 | Passwoord11 |



