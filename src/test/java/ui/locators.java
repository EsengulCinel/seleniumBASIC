package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 public class locators {
    public static String browser="Chrome"; //external configuration XLS-CVS file
    public static FirefoxDriver driver;
    public static ChromeDriver driver1;

    public static void main(String[] args) throws InterruptedException {

        if(browser.equals("Firafox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        else if(browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver1= new ChromeDriver();
        }

        driver1.get("https://www.saucedemo.com/");
        WebElement password=driver1.findElement(By.id("password"));

    }
}
