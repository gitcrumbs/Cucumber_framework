

@Banker-Transactions
Feature: Acceptance testing to validate Select Banker and Create Deposit
  In order to validate that 
  the Deposit Amount is working
  Doing the Acceptance Testing

  @Search-Bankers-Verify-Deposits
  Scenario: Validate Select Banker and Create Deposit
    Given I am on the Home Page "http://way2automation.com/angularjs-protractor/banking/#/login" of XYZ Bank Website
    When I Select the name as <Menu>
      | Hermoine Granger |
    And click on "Login" button
    And select Account Number <Account Number> from dropdown      
      | 1001 |
      | 1002 |
      | 1003 |
    And Create <Multiple Deposits>
      | 20000  |
      | 50000  |
      | 70000  |
      | 80000  |
    Then the message on the screen should be "Deposit Successful" 

