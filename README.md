# simple-spring-oil-and-gas-industry-database
Project documentation
  * Technologies (Java oracle 19, MS SQL Server, Spring Boot, OpenAPI)

Installation and settings:
  - Open project with your Java IDE
  - Open your SQL server (MS SQL, MySQL, PostgreSQL)
  - In java project on the path (src/main/resources/static/CREATE_TABLE.sql) you will find Query for creating a table
  - Also on the pathh (src/main/resources/static/INSERT_MOCK_DATA.sql) you will find Query to add mock data to insert into table
  - You will need to set a username and password for created database and set it up in src/main/resources/application.properties
  - After that it's ready to run
  - You can use GET method in postman and http://localhost:8080/api/oilwell/all to get all data from a database you created
  - And you can use POST method in postman and http://localhost:8080/api/oilwell/insert to insert data into database using JSON
 
 {
 
    "well_id": enter well id (number),
    
    "well_name": "enter well name",
    
    "well_perforation": "enter perforation",
    
    "well_tubing_diameter": enter number,
    
    "well_tubing_depth": enter number,
    
    "well_casing_diameter": enter number,
    
    "well_casing_depth": enter number1,
    
    "well_drill_date": "enter date"
    
}
