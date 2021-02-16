#Author: sachin Kulkarni
#Keywords Summary : Given, When, And, Then
#Feature: List of scenarios.
@tag
Feature: Gmail Login and attachment feature test

  @tag1
  Scenario: Login with corrrect user name and password and Compose email with attachment to send an email
    Given Valid user logs in to Gmail with username and password
    When User logged in using user name and password navigates to gmail inbox
    And User need to click on compose email button
    And User need to add text in subject and body of email
    And User need to click on add attachment  
    And User need to add email reciepient
    Then User click on send button
      
