package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeClass {
    public static void main(String[] args) {


        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String title = driver.getTitle();
        System.out.println("Current URL " + title);
        System.out.println("The page Resource: " + driver.getPageSource());

        String login = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(login);
        System.out.println("Current URL " + login);

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abc@gmail.com");

        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("abc1234");

        driver.close();


    }
}