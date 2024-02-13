# Canva SignUp Selenium Script

This Selenium script automates the sign-up process on Canva.

## Prerequisites

Before running the script, ensure you have the following:

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html) installed
- [Maven](https://maven.apache.org/download.cgi) installed

## How to Run

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/your-repo.git
    ```

2. Navigate to the project directory:

    ```bash
    cd your-repo
    ```

3. Update the Selenium WebDriver and WebDriverManager dependencies in the `pom.xml` file if needed.

4. Open a terminal and run the following command to execute the script:

    ```bash
    mvn clean test
    ```

   This command will compile and run the Selenium script.

5. Monitor the browser as the script performs the sign-up process on Canva.

6. Review the console output for any errors or messages.

7. After completion, the browser will be closed.

**Note:** Ensure that the script is run in an environment with internet access, as WebDriverManager downloads the required WebDriver binaries during execution.

## Important

- Be mindful of using automated scripts on websites, and make sure to comply with the terms of service of the website you are interacting with.

- Update the Canva website URL, form fields, and locators in the script if the website structure changes.

Happy testing!
