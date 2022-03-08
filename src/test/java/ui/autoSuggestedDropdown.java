package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestedDropdown {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.ucuzabilet.com/ ");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"from_text\"]")).click();
        WebElement from= driver.findElement(By.xpath("//input[@id='from_text']"));
        from.sendKeys("istanbul");
        Thread.sleep(2000);
        from.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        from.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.close();
    }
}
