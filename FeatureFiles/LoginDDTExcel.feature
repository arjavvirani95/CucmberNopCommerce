Feature: Login Data Driven with Excel

  @sanity
  Scenario Outline: Login Data Driven Excel
    Given the user navigates to login page
    Then the user should be redirected to the MyAccount Page by passing email and password with excel row "<row_index>"

    Examples: 
      | row_index |
      |         0 |
      |         1 |
      |         2 |
