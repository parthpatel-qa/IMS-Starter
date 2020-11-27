Coverage: 64%
# Inventory Management System - QA Week 5 Individual Project

This inventory management system is a Java based application which is designed to store customer information. This online database contains tables which house orders and items through which a user is able to create, view, update, or delete said orders.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.


### Prerequisites

What things you need to install the software and how to install them
1. Java14
2. An IDE of your choice
3. A running local SQL Server
4. Maven
5. Git

To ensure you have javan and maven installed, run the following lines in your terminal
```
java -version
mvn -version
```

### Installing

1. Git bash into your folder and clone this repository down for you to use.

Use this line
```
git clone https://github.com/parthpatel-qa/IMS-Starter.git
```

2. Open this project in your desired IDE

```
In eclipse that would be File>Import>Maven>ExistingMavenProjects>Find the file>Finish
<p align="center">
<img width="500" height="350" src="./Documentation/Eclipse.png">
</p>
```

3. I have set the Database URL to a local host but you can change it to anything you require in src/main/java/utils/DBUTils.java
```
DB_URL = "jdbc:mysql://localhost.3306/ims";
```

4. Direct yourself to the Runner.Java and run as Java Application
USERNAME:
```
root
```
PASSWORD:
```
root
```
5. From here you will be able to choose which domain you want to work with or exit the application
```
<p align="center">
<img width="500" height="350" src="./Documentation/Domain.png">
</p>
```


## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do

### Unit Tests 

Explain what these tests test, why and how to run them

```
Give an example
```

### Integration Tests 
Explain what these tests test, why and how to run them

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
