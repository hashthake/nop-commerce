package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserClass {

    static String browser = "Chrome";
    static String baseUrl = "https://demo.nopcommerce.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver=new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webriver.edge.driver","drivers/msedgedriver.exe");
            driver=new EdgeDriver();
        } else{
            System.out.println("Wrong Browser");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
        driver.close();
    }
}
