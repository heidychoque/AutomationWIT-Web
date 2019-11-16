Feature: Home page design

  Background: Preconditions
    Given Load home page for footer
    And window is maximized

    Scenario: Verify existence of carousel and its components
      When Verify existence of carousel on home page
      And Verify existence of Contact Us button on carousel on home

    Scenario:Verify Metrics section design
      When Verify existence of label Metrics
      Then Verify alignment of label Metrics
      When Verify existence of label Diversity
      Then Verify alignment of label Diversity
      And Verify existence of image Diversity
      And Verify existence of description of Diversity
      When Verify existence of label Community
      Then Verify alignment of label Community
      And Verify existence of image Community
      And Verify existence of description of Community
      When Verify existence of label Women working
      Then Verify alignment of label Women working
      And Verify existence of image Women working
      And Verify existence of description of Women working

    Scenario:Verify Home Parallax section design
      Then Verify existence of Parallax
      And Verify existence of Parallax button

    Scenario: Verify Testimonies section design
      When Verify existence of label Testimonies
      Then Verify alignment of label Testimonies
      And  Verify existence of description of Section Testimonies
      And Verify images section

    Scenario: Verify function of Contact Us button on carousel
      And Click Contact Us button on carousel

    Scenario: Verify function of button on Parallax on Home page
      When Click Know Our Team button on parallax
      Then Click WIT button on navbar from About Us












