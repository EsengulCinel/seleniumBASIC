package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClickDemo {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.manage().window().maximize();
        WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);


        WebElement kare= driver.findElement(By.xpath("//*[@id=\"swatch\"]"));
        Actions actions=new Actions(driver);
        actions.contextClick(kare).perform();    //eğer ki spesifik bir yere tıklamak istiyorsak





    }
}
