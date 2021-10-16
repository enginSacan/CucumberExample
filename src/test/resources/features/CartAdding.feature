Feature: Cart Adding Behaviours
  Background:
    Given Open Home Page

  Scenario: Adding a product to the cart by logging in.
    Given User Login
    When  User search product Uzaktan Kumandalı Arabalar
    And   User choose one product
    Then   User add two different sellers for chosen product

  Scenario:  Adding a product to the cart by without logging in.
    Given User go to page Hobi
    When User go to tab Uzaktan Kumandalı Arabalar
    And User Choose Category Drone Yedek Parçaları
    Then  User add product to cart