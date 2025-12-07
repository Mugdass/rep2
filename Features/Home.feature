@Home
Feature: facebook login
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario outline
    Given I am on a Facebook page "http://www.facebook.com"
    When I enter <username>
    And When I enter <password>
    And I click on Login button
    Then I verify I am in user Home page

    Examples: 
      | username                       | password              |
      | "testingseleniumdas@yahoo.com" | "testingseleniumdas1" |
