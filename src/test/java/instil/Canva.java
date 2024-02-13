package instil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Canva {

        public static void main(String[] args) {
            // Setup WebDriver using WebDriverManager
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            try {
                // Maximize the window
                driver.manage().window().maximize();

                // Navigate to Canva
                driver.get("https://www.canva.com/en_gb/");

                // Click on the "Sign up" button
                driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div[2]/div/header/div[6]/button[2]/span"))
                .click();

                // Click on the "Continue another way" button
                 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/button"))
                 .click();

                // Click on the "Continue with email" button
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/button[6]"))
                .click();



                // Fill in the registration form
                driver.findElement(By.id(":r1r:"))
                .sendKeys("instill@puabook.com");

                WebElement passwordField = driver.findElement(By.id("password"));
                passwordField.sendKeys("your_password");

                // Add additional form filling if needed

                // Click on the "Sign up" button
                WebElement signUpFormButton = driver.findElement(By.xpath("//button[contains(text(), 'Sign up')]"));
                signUpFormButton.click();

                // Wait for the signup process to complete (you may need to add explicit waits)

                // Perform additional actions after signup if needed

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Close the browser
                driver.quit();
            }
        }
    }

}
