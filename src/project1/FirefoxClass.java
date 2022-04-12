package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxClass {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        // Maximize window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Title of the page
        System.out.println("Title of the page : " + driver.getTitle());
        //Resource of the page
        System.out.println("Resource of the page : " + driver.getPageSource());
        //Current URL of the page
        System.out.println("Current url of the page : " + driver.getCurrentUrl());

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abc@gmail.com");
        WebElement passwordFiels = driver.findElement(By.id("Password"));
        passwordFiels.sendKeys("123abc");
    }
}
