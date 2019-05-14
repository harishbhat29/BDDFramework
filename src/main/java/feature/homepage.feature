Feature: Informatica IDD Login feature 

Scenario: IDD Homepage Test scenario 

	Given user is on Login page 
	When title of the page is Informatica MDM Data Director 
	Then enter username and password 
	Then user click on login button 
	Then user is on homepage
	Then verify homepage title