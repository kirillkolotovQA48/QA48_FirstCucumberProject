Feature: Login

  @ValidData
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User open iLcarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User click on Yalla button
    Then User verifies Success message is displayed
    And User quites browser

  @WrongPassword
  Scenario Outline: Login with valid email and wrong password
    Given User launches Chrome browser
    When User open iLcarro HomePage
    And User clicks on Login link
    And User enters valid email and wrong password
    |email|password|
    |<email>|<password>|
    And User click on Yalla button
    Then User verifies Error message is displayed
    And User quites browser
    Examples:
      | email        |password|
      | aa@gmail.com |Aa12345!|
      | aa@gmail.com |Aa1234567|
      | aa@gmail.com |ФФGGDDПП""|

