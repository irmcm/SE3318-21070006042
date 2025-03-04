# Week 1 Maven Project

This is a Maven project created for Week 1 of the course. Below are the details of the project structure and how to build and run the application.

## Project Structure

```
week1
├── src
│   ├── main
│   │   ├── java
│   │   │   └── App.java
│   │   └── resources
│   └── test
│       ├── java
│       │   └── AppTest.java
│       └── resources
├── pom.xml
└── README.md
```

## Building the Project

To build the project, navigate to the project directory and run the following command:

```
mvn clean install
```

## Running the Application

After building the project, you can run the application using the following command:

```
mvn exec:java -Dexec.mainClass="App"
```

## Running Tests

To run the tests, use the following command:

```
mvn test
```

## Additional Information

Make sure you have Maven installed and properly configured on your system. You can find more information about Maven [here](https://maven.apache.org/).