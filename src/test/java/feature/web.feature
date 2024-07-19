Feature: Test Automation Web

  @web
  Scenario: Test login web normal
    Given open web login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user clik login button
    And user will see icon cart in homepage

  @web
  Scenario: Test login web with lock user
    Given open web login page
    And user input username "locked_out_user"
    And user input password "secret_sauce"
    And user clik login button
    And user will see error massage "user has been locked out."

  @web
  Scenario: Test login web with invalid user
    Given open web login page
    And user input username "locked_out_user"
    And user input password "secret_saucesssss"
    And user clik login button
    And user will see error massage "Username and password do not match "

  @web
  Scenario: Test login web add to cart
    Given open web login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user clik login button
    And user will see icon cart in homepage
    And user add item to cart
    And user add item to cart
    And user add item to cart
    Then verify cart item is match "3"

  @web
  Scenario: Test login web remove to cart
    Given open web login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user clik login button
    And user will see icon cart in homepage
    And user add item to cart
    And user add item to cart
    And user add item to cart
    Then verify cart item is match "3"
    And user remove item from cart
    Then verify cart item is match "2"
