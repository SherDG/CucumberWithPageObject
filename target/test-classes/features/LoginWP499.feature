
@LoginToWP499
Feature: Login to WP499
	In order to validate WP499 Dashboard

  @LoginWP499-positive
  Scenario: Validate WP499 Dashboard
    Given I on the Login Page "http://499.wordpress.imunify.local/wp-admin.php"
    When I set login as "admin"
    And I set password as "password1"
    And I click on LogIn button
    Then I validate the Dashboard that text "Welcome to Wordpress!" is present 
    And I validate the SideMenu items