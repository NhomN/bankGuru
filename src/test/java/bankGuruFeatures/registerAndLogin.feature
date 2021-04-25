Feature: Register

  @register_login
  Scenario: Register to system and login
  	# Open URL --> Hooks
  	# Given: difined preconditon
  	# When: Action will be excuted
  	# Then: Verify of the previous step
  	Given Get Login Page Url
    When Open Register Page
    And Input to email ID
    And I click to Submit button
    Then Get User and password infor
    When Back to Login page
    And Submit valid infor to login form
    Then Home page display
