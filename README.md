# Week 5 Project

This is a Maven project named `week5`. Below are the instructions on how to build and run the application.

## Project Structure

```
week5
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

## Dependencies

Make sure to check the `pom.xml` file for any dependencies required for the project.