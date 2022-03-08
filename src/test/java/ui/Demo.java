package ui;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\amdocsecinel\\Desktop\\selenium_test");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();   // FirefoxDriver driver1=new FirefoxDriver();


        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
        driver.findElement(By.id("gh-btn")).click();
        driver.close();

    }
}
