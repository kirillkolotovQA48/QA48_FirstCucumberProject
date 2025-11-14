Feature: HomePage

  @Navigate
  Scenario: Verify HomePage title is displayed
    Given User launches Chrome browser
    When User open iLcarro HomePage
    Then User verifies HomePage title
    And User quites browser