package instil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

    public class OpenWeatherUITest {

        @Test
        public void validateWeatherIsSunny() {
            // Set the OpenWeatherMap credentials and location
            String username = "your_openweathermap_username";
            String password = "your_openweathermap_password";
            String location = "your_location";

            // Set up the WebDriver (assuming ChromeDriver is used)
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            WebDriver driver = new ChromeDriver();

            // Navigate to OpenWeatherMap and sign in
            driver.get("https://openweathermap.org/");
            WebElement signInButton = driver.findElement(By.linkText("Sign In"));
            signInButton.click();

            WebElement usernameField = driver.findElement(By.id("user_email"));
            WebElement passwordField = driver.findElement(By.id("user_password"));
            WebElement signInSubmitButton = driver.findElement(By.name("commit"));

            usernameField.sendKeys(username);
            passwordField.sendKeys(password);
            signInSubmitButton.click();

            // Navigate to the One Call 3.0 endpoint page
            driver.get("https://openweathermap.org/api/one-call-3");

            // Validate that the weather is sunny
            assertTrue(driver.getPageSource().contains("Sunny"),
                    "The weather is not reported as sunny on the One Call 3.0 endpoint page");

            // Close the browser
            driver.quit();
        }
    }


}
