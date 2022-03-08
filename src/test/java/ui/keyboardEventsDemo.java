package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardEventsDemo {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://extendsclass.com/text-compare.html");
        driver.manage().window().maximize();
        WebElement sourcetext= driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[7]/pre"));
        Actions actions=new Actions(driver);
        Thread.sleep(2000);
        actions.keyDown(sourcetext, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();

        WebElement destination=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/pre/span"));
        Actions actions1=new Actions(driver);
        Thread.sleep(2000);
        actions.keyDown(destination,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();


        driver.close();


    }
}
