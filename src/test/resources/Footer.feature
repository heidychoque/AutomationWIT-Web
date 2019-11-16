Feature: Footer feature
  Background: Preconditions
    Given Load home page
    And window is maximized

  Scenario: Verify Footer section design
    When Verify existence of footer
    Then Verify  existence of label Menu
    And Verify existence of About Us button on footer
    And Verify existence of Activities button on footer
    And Verify existence of Contact us button on footer
    When Verify existence of label WIT
    Then Verify existence of Address label
    And Verify existence of Phone label
    And Verify existence of email label
    And Verify existence of Facebook button
    And Verify existence of Twitter button
    And Verify existence of Instagram button
    And Verify existence of Linkedin button
    And Verify existence of Youtube button
    And Verify alignment of label title of Sign in section
    And Verify existence of text field
    And Verify existence of Sign Up button

  Scenario: Verify function of Our Team button on footer
    Then Click Our Team button on footer

  Scenario: Verify function of Activities button on footer
    Then Click Activities button on footer

  Scenario: Verify function of Contact Us button on footer
    Then Click Contact Us button on footer

  Scenario: Verify Facebook Social networks buttons
    Then Click Facebook button

  Scenario: Verify Twitter Social networks buttons
    Then Click Twitter button

  Scenario: Verify Instagram Social networks buttons
    Then Click Instagram button

  Scenario: Verify Linkedin Social networks buttons
    Then Click Linkedin button

  Scenario: Verify Youtube Social networks buttons
    Then Click Youtube button



  Scenario:Verify Sign Up buttons with Correct email and checkboxes on dialog and Close button
    When Send Correct email to text field Sign up
    And Click Sign Up button


  Scenario: Verify Sign Up button with incorrect email,error dialog and close button
    When Send Incorrect email to text field Sign up
    And Click Sign Up button



