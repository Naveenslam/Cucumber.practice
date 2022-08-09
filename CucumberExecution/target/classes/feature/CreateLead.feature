Feature: CreateLead in leafTab 
Scenario: Test CreateLead Functionalitty

Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click on login button
Then homepage should be displayed
When click on 'CRM/SFA' link
Then 'My Home' page should be displayed
When click on 'Leads' link
Then 'My Leads' page should be displayed
When click on 'Create Lead' link
Then 'Create Lead' page should be displayed
Given Enter the CompanyName as 'Testleaf'
And Enter the FirstName as 'Ramkumar'
And Enter the LastName as 'R'
And Enter the Mobile Number as '7750881268'
When click on Create Lead button