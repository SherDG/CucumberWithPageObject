
@GeneralSettingsEditingWP499
Feature: Editing WP499 GeneralSettings 

  @GeneralSettingsEditingWP499-positive
  Scenario: Validate WP499 Dashboard
    Given I on the Login Page "http://499.wordpress.imunify.local/wp-admin/"
    When I set login as "admin"
    And I set password as "password1"
    And I click on LogIn button
    Then I click on goToSettings button
    Then I clear Title
    And I set new title "498.wordpress.imunify.local_test_TCJ_6"
    And I click on Save button
    Then I goToWPlocal
    Then I validate the Page title has text "498.wordpress.imunify.local_test_TCJ_6"