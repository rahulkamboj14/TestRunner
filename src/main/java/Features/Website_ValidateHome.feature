Feature: Website-Validate auto suggest and 404 pages
  
  Scenario: Verify 404 Pages
    Given I am at the "User Website"
    And I pass the "error404Page2" in the Url
    Then I should see the "Page Not Found" page



