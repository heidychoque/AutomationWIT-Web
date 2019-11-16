Feature: About Us page design

  Background: Preconditions
    Given Load home page

    And window is maximized
    And Click About Us button on navbar

  Scenario: Verify Parallax components
    When Verify existence of Parallax on About us
    Then Verify existence of About Us label on parallax
    And Verify existence of description of About Us on parallax
    And Verify existence of Contact us button on parallax

  Scenario: Verify design of Members section
    Then Verify existence of Members label
    And Verify alignment of Members label
    And Verify existence of description of Members
    And Verify alignment of description of Members
    And Verify existence of cards of Members
    And Verify existence of images members
    And Verify existence of name label
    And Verify existence of member Linkedin social button
    And Verify existence of member Twitter social button
    And Verify existence of member Facebook social button

  Scenario:Verify design of Other Communities section
    Then Verify existence of other communities label
    And Verify alignment of other communities label
    And Verify existence of other communities logos

  Scenario: Verify function of Contact button on parallax on about us view
    Then Click ContactUs button on parallax on about us

  Scenario: Verify function of GDG Cochabamba button on Communities section on about us view
    Then Click GDG Cochabamba button

  Scenario: Verify function of Technovation button on Communities section on about us view
    Then Click Technovation button

  Scenario: Verify function of GP4Tech button on Communities section on about us view
    Then Click GP4Tech button

  Scenario: Verify function of Girls Hack button on Communities section on about us view
    Then Click Girls Hack button

  Scenario: Verify function of Pyladies button on Communities section on about us view
    Then Click Pyladies button

  Scenario: Verify function of Women Tech Markers Cochabamba button on Communities section on about us view
    Then Click Women Tech Markers Cochabamba  button


