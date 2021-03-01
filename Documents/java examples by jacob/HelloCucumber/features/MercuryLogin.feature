# this is a comment in a feature file
# we are  writing tis in the language called Genkhin
# This is where user strories can be translated into test
# addtionally they allow tracking of the user stories

# First you start out with the feature,the description of User story you are trying to
# accomplish

Feature: Mercury Tours Login
	As a User,I wish to login to Mercury Tours using property credentials
	
	
	# General Scenario would look like the following
	# Scenario :Logging into Mercury Tours 
	# Given a user is at the homepage of Mercury free tours
	# When a user inputs their username and password and submits 
	# Then the user is redirected to successful login page
	
	
	# Scenario Outline implies that we will be using multiple data sets
	Scenario Outline: Logging into Mercury Tours
	Given  a user is at the homepage of Mercury tours
	When a user inputs their "<username>"
	And a user inputs  "<password>"
	But then submits the information
	Then the User is redirected to the successful login page
	
	
	Examples:
	 |username  |password|
	 |bobbert   |bobbert|
	 |goodbye   |hello|
	 |asd |asd|