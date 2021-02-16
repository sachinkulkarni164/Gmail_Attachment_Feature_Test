$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Sachin/eclipse-workspace/Gmail_Attachment_1.0/src/main/java/Features/login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: sachin Kulkarni"
    },
    {
      "line": 2,
      "value": "#Keywords Summary : Given, When, And, Then"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    }
  ],
  "line": 5,
  "name": "Gmail Login and attachment feature test",
  "description": "",
  "id": "gmail-login-and-attachment-feature-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Login with corrrect user name and password and Compose email with attachment to send an email",
  "description": "",
  "id": "gmail-login-and-attachment-feature-test;login-with-corrrect-user-name-and-password-and-compose-email-with-attachment-to-send-an-email",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Valid user logs in to Gmail with username and password",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User logged in using user name and password navigates to gmail inbox",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User need to click on compose email button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User need to add text in subject and body of email",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User need to click on add attachment",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User need to add email reciepient",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User click on send button",
  "keyword": "Then "
});
formatter.match({
  "location": "GmailAttachment.valid_user_logs_in_to_Gmail_with_username_and_password()"
});
formatter.result({
  "duration": 29003273900,
  "status": "passed"
});
formatter.match({
  "location": "GmailAttachment.user_logged_in_using_user_name_and_password_navigates_to_gmail_inbox()"
});
formatter.result({
  "duration": 15646682000,
  "status": "passed"
});
formatter.match({
  "location": "GmailAttachment.user_need_to_click_on_compose_email_button()"
});
formatter.result({
  "duration": 685597800,
  "status": "passed"
});
formatter.match({
  "location": "GmailAttachment.user_need_to_add_text_in_subject_and_body_of_email()"
});
formatter.result({
  "duration": 8553955300,
  "status": "passed"
});
formatter.match({
  "location": "GmailAttachment.user_need_to_click_on_add_attachment()"
});
formatter.result({
  "duration": 19667019800,
  "status": "passed"
});
formatter.match({
  "location": "GmailAttachment.user_need_to_add_email_reciepient()"
});
formatter.result({
  "duration": 7430268400,
  "status": "passed"
});
formatter.match({
  "location": "GmailAttachment.user_click_on_send_button()"
});
formatter.result({
  "duration": 279245900,
  "status": "passed"
});
});