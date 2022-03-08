package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderDemo {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.manage().window().maximize();
        WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);

        WebElement slider=driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(slider,-100,100).perform();



        Thread.sleep(2000);

        driver.close();

    }
}
