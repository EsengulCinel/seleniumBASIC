package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginTest {
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
        driver1.manage().window().maximize();
        driver1.findElement(By.id("user-name")).sendKeys("esengul");
        driver1.findElement(By.id("password")).sendKeys("deneme123");
        driver1.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        driver1.close();

    }
}
