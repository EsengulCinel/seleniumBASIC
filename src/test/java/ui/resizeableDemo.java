package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resizeableDemo {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/resizable/");
        driver.manage().window().maximize();

        WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);

        WebElement element=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(element,100,10).perform();
        Thread.sleep(2000);

        driver.close();

    }
}
