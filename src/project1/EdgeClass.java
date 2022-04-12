package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeClass {

    public static void main(String[] args) {
        String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        //maximize window
        driver.manage().window().maximize();
        //Set time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Title of the page
        System.out.println("Title of the page " + driver.getTitle());
        System.out.println("Resource of the URL : " + driver.getPageSource());
        System.out.println("Current URL : " + driver.getCurrentUrl());

        //Elements of login and password field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("123@gmail.com");
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("abc123");
        driver.close();
    }
}
