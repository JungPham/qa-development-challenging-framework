Narrative:
    In order to start using application to keep track of all the loan information and help to faster proceed all the requests.
    As a user
    I want to register a account

Scenario: TC01 When a registered director of the company open an Aspire account by filling all mandatory fields, account is created successfully
Given User goes to Url
When User click on Register button on Login Page
And User enter Pham Thi Thuy Dung as full Name as per ID
And Generate a random number used for email address and mobile number
And User enter a random email address
And User enter a random mobile number
And User click on Where did you hear about us dropdown
And User select LinkedIn as Where did you hear about us
And User check read and agree Policy checkbox
And User click on Continue button
And User enter fixed OTP 1234 for phone on Mobile OTP Verification Page
And User click on Continue button
And User select I am a registered director of the company on Role Selector Page
And User click on What solutions are you looking for
And User select dolorem as What solutions are you looking for
And User click on Continue button
And User choose Standard Registration as a registration method
And User click on Date of birth on Personal Details Page
And User select any Date of birth
And User select Argentina as Nationality
And User select Female as Gender
And User click on Submit button
And User enter fixed OTP 1234 for email on Email OTP Verification Page
And User enter Company of JungPham as Business legal name on Business Details Page
And User select Limited companies as Entity category
And User select Limited Liability Partnership as Entity type
And Generate a random Business number
And User enter a random Business registration number (UEN)
And User select Manufacturing as Industry
And User select Fine Arts as Sub-Industry
And User click on Continue button
And User enter User have to input Business activities here as Business activity on Business Details Edit Page
And User enter User have to input detailed example products as detailed example of product/services
And User enter https://www.aspire.com as Live business website
And User select 2-10 as Number of employees
And User select S$1,418 - S$2,836 as Annual turnover
And User click on Submit button
And User select Yes for company directors or shareholders qualify as Politically Exposed Person (PEP), close family member or close associate of a PEP
And User select No for company have corporate shareholders with more than 10% ordinary shares
And User click on Continue button
And User select Identification number as Please be ready to provide the following documents for identity verification
!-- From this step onwards can be ignore as requirements





