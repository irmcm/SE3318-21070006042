# Week 8 Maven Project

This project is a simple Maven application structured to demonstrate the basic setup and functionality of a Java application.

## Project Structure

```
week8
├── src
│   ├── main
│   │   ├── java
│   │   │   └── App.java
│   │   └── resources
│   │       └── application.properties
│   ├── test
│   │   └── java
│   │       └── AppTest.java
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd week8
   ```

2. **Build the project**:
   ```
   mvn clean install
   ```

3. **Run the application**:
   ```
   mvn exec:java -Dexec.mainClass="App"
   ```

## Usage Guidelines

- Modify the `application.properties` file to configure application settings.
- Add your Java code in `App.java` and write unit tests in `AppTest.java`.
- Use `pom.xml` to manage dependencies and plugins.

## Contributing

Feel free to submit issues or pull requests for improvements or bug fixes.