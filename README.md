# SampleApplication
This is the repo for demonstrating JAVA capabilities. 

Please write a backend infrastracture using the Spring framework and the MVC design pattern to:
- implement the logic to receive a Rest API call carrying the json object included in the project
- implement the logic for reading/writing to a sql database.
- implement the logic to write all the attributes of the json object as a record of a sql table called "user" 
- implementing the logic to send a response back to a client that the db write was successful
- implement the logic to delete a user when receiving a Rest call with "delete" command and requesting the deletion of a user by thier email address.

Please assume that:
- the json object is sent to the cloud in the body of a POST Rest call
- the sql db is available 

Please design a system that would accomplish the goal. Some of the points have been intentionally made vague to leave the design and implementation decisions to you as the developer.
