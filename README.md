# Gmail_Attachment_Feature_Test
This project is to test the gmails compose mail and send the email with attachment to a particular receipient

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
    
    How to use this project -
    Prerequsites - Already should have Eclipse installed
    
    1. download the project and extract it some directory
    2. import the project from eclipse
    3. Change the Chrome Driver directory where you have placed them
    4. Need some user name and password changes if the used gmail user name and password does not support.
    5. After all setup run TestRunner.java as Junit Test
