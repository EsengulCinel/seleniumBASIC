package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class BasicWebDriverDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver chromeDriver=new ChromeDriver();

        chromeDriver.get("https://www.saucedemo.com/");
        chromeDriver.manage().window().maximize();

        String currentUrl= chromeDriver.getCurrentUrl();
        System.out.println(currentUrl);

        String tittle= chromeDriver.getTitle();
        System.out.println(tittle);

//        String pageSource=chromeDriver.getPageSource();
//        System.out.println(pageSource);

        // chromeDriver.navigate().to("https://www.google.com/");


        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        chromeDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        chromeDriver.findElement(By.id("login-button")).click();

        List <WebElement> webelement=chromeDriver.findElements(By.xpath("//div[@class=\"inventory_list\"]/div"));
        System.out.println(webelement);

        chromeDriver.navigate().to("https://www.demo.guru99.com/popup.php");


        chromeDriver.findElement(By.xpath("//a[text()=\'Click Here\']")).click();

        Set <String> allWindow= chromeDriver.getWindowHandles();
        for (String windowlar :allWindow){
            chromeDriver.switchTo().window(windowlar);
        }

        chromeDriver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("test@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@name='btnLogin']")).click();


        chromeDriver.quit();


    }
}
