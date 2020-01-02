Feature: Search By Browsing

  Scenario: Customer can browse chesse souffle
    Given I navigate to Tesco homepage
    And I click on the Recipes tab
    And I click on the Recipe inspiration
    And I click on Step by step recipes link
    When I click on How to make chesse souffle link
    Then a step to step guide of how to make chesse souffle is displayed