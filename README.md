#SECTION 1 

Tools Used: REST Assured (Java)

Reasons for Choosing REST Assured:
-Easy to use and understand, especially for RESTful APIs.
-Native support for JSON parsing.
-Integrates well with Java and Maven.

Test Description:
-Validate the One Call 3.0 endpoint of the OpenWeatherMap API.
-Check that the weather is sunny in the specified location.
-If the weather is not reported as sunny, the test should fail.



# Canva SignUp Selenium Script

This Selenium script automates the sign-up process on Canva.

## Prerequisites

Before running the script, ensure you have the following:

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html) installed
- [Maven](https://maven.apache.org/download.cgi) installed

## How to Run

1. Clone the repository:

    ```bash
    git clone https://github.com/Samzeeke/Instill-Education-TEST.git
    ```

2. Navigate to the project directory: (You will find the file Weather.Java which contains section 1 and Canva.java which contains section 2. of the test in this path src/test/java/instil)

    ```bash
    cd your-repo
    ```

3. Update the Selenium WebDriver and WebDriverManager dependencies in the `pom.xml` file if needed.

4. Open a terminal and run the following command to execute the script or simply just click run on your intellij idea:

    ```bash
    mvn clean test
    ```

   This command will compile and run the Selenium script.

5. Monitor the browser as the script performs the sign-up process on Canva.

6. Review the console output for any errors or messages.

7. After completion, the browser will be closed.

**Note:** Ensure that the script is run in an environment with internet access, as WebDriverManager downloads the required WebDriver binaries during execution.
