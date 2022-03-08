package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import javax.swing.*;

public class checkBoxDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver,30);

        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement radio =driver.findElement(By.id("doi0"));
        Actions action=new Actions(driver);
        action.moveToElement(radio);
        action.perform();

        Thread.sleep(2000);

        driver.findElement(By.name("interest_market_c")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"interest_market_c0\"]")));
        driver.findElement(By.xpath("//*[@id=\"interest_market_c0\"]")).click();
        //tekrar tıkladıgımızda uncheck olur dimi mantıken :)

        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

        driver.close();




    }
}
