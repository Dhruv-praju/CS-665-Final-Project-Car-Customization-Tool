
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Dhruv Prajapati       |
| Date         | 05/02/2024                 |
| Course       | Spring      |
| Final Project |                            |

# Project Overview
The goal of this project is to develop a web or desktop application that allows users to configure and customize a car according to their preferences. Users should be able to select various attributes of the car such as model, color, engine type, interior features, and accessories.

# GitHub Repository Link:
https://github.com/Dhruv-praju/CS-665-Final-Project-Car-Customization-Tool

# Implementation Description 

Following patterns were Implemented in the project:

**1. Abstract Factory Pattern:**
-   Flexibility:

    The Abstract Factory pattern provides a high level of flexibility by encapsulating the creation of families of related objects (e.g., Honda cars, Toyota cars) without specifying their concrete classes.
    New object types (car brands or models) can be added by implementing new concrete factories (e.g., FordFactory) that adhere to the abstract factory interface. This allows for easy extension without modifying existing client code.

-   Simplicity and Understandability:

    The use of abstract factories simplifies the process of creating related objects and promotes a consistent interface for clients to interact with.
    The abstract factory pattern enhances readability and maintainability by organizing object creation logic into cohesive units (factories) based on related families of products (cars).

-   Avoidance of Duplicated Code:

    Abstract factories help avoid duplicated code by centralizing the creation logic for related objects within factory classes.
    This pattern ensures that clients interact with factory interfaces rather than directly instantiating concrete product classes, thereby reducing code duplication and promoting scalability.

-   Choice of Pattern:

    The Abstract Factory pattern was chosen to support the creation of families of related objects (e.g., cars from different brands) while decoupling clients from specific implementations.
    This pattern enables seamless integration of new car brands or models into the system by extending the abstract factory interface with new concrete implementations.

**2. Builder Pattern:**
-   Flexibility:

    The Builder pattern facilitates the construction of complex objects (cars) step by step, allowing different configurations to be composed dynamically.
    New object types (car variants like sedan, SUV) can be added by implementing new builders that encapsulate the construction process, enabling flexible and customizable object creation.

-   Simplicity and Understandability:

    Builders simplify the creation of complex objects by separating the construction process from the representation, making it easy to understand and modify configurations.
    The use of builders promotes readability and maintainability by exposing a fluent interface for clients to specify object configurations without directly dealing with complex construction logic.

-   Avoidance of Duplicated Code:

    The Builder pattern eliminates the need for telescoping constructors or multiple constructor overloads by allowing the stepwise construction of objects using a single builder interface.
    This pattern prevents duplicated code by promoting reusable building steps across different object configurations.

-   Choice of Pattern:

    The Builder pattern was chosen to handle the creation of configurable and complex car objects (e.g., specifying car model, color, engine) while providing flexibility and ease of use for clients.

**3. Strategy Pattern:**
-   Flexibility:

    The Strategy pattern enables interchangeable behaviors (pricing strategies) to be encapsulated as objects, allowing dynamic selection and modification at runtime.
    New pricing strategies can be added by implementing new strategy classes that adhere to a common interface, promoting flexibility in selecting and applying different pricing algorithms.

-   Simplicity and Understandability:

    Strategies isolate specific algorithms (pricing logic) into separate classes, making them easy to understand and modify without affecting other parts of the system.
    This pattern enhances readability by decoupling pricing logic from client code and promoting a clear separation of concerns.

-   Avoidance of Duplicated Code:

    The Strategy pattern avoids duplicated code by encapsulating variations of an algorithm (pricing calculation) into separate strategy classes, promoting code reuse and maintainability.
    By applying the Strategy pattern, different pricing strategies can be implemented independently without duplicating the core pricing logic.

-   Choice of Pattern:

    The Strategy pattern was chosen to manage various pricing algorithms (e.g., base price, additional features cost) in a flexible and extensible manner, allowing easy integration of new pricing strategies into the car customization tool.

**4. Decorator Pattern:**
-   Flexibility:

    The Decorator pattern enhances flexibility by allowing behavior (e.g., additional features, behaviors) to be added dynamically to individual car configurations without affecting their structure.
    New decorators can be easily added by implementing new decorator classes, providing a flexible way to extend and modify car configurations at runtime.

-   Simplicity and Understandability:

    Decorators wrap objects (e.g., cars) with additional functionality in a transparent manner, making it easy to add or remove features without altering the core object's interface.
    This pattern enhances readability by promoting a clear separation between core functionality and optional enhancements (decorators).

-   Avoidance of Duplicated Code:

    The Decorator pattern avoids duplicated code by allowing behaviors to be composed dynamically at runtime through a combination of decorators.
    By applying decorators, specific enhancements can be added to different car configurations without duplicating the underlying car implementation.

-   Choice of Pattern:

    The Decorator pattern was chosen to provide a flexible and modular approach to adding features or behaviors (e.g., safety features, autonomous driving) to car configurations without subclassing or modifying existing car classes.
    This pattern enables a highly configurable and extensible system where decorators can be applied independently or in combination to customize car functionalities.

# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




