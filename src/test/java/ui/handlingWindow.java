package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class handlingWindow {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.salesforce.com/eu/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"globalnavbar-header-container\"]/div[3]/div/div/div/a/span")).click();

        Set<String> window= driver.getWindowHandles();
        System.out.println(window);
        Iterator<String> iterator=window.iterator();
        String parentWindow=iterator.next();
        String childWindow=iterator.next();

        driver.switchTo().window(childWindow); //yeni sayfaya gitt

        driver.findElement(By.name("UserFirstName")).sendKeys("test1");
        driver.findElement(By.name("UserLastName")).sendKeys("test2");
        driver.switchTo().window(parentWindow); //eski sayfaya döndü

        driver.quit();
    }
}
