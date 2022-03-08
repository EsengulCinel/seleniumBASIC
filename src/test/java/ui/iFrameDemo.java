package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.manage().window().maximize();
        //driver.switchTo().frame(0); //bu şekilde sayfadaki ilk frame'e gittik.
        WebElement frame1=driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(frame1);//tıklamak istediğimiz frame id'ye sahipse index yerine isim verdik.
        driver.findElement(By.xpath("/html/body/button")).click();

        String alert= driver.switchTo().alert().getText();
        System.out.println(alert);
        driver.switchTo().alert().accept();

        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());
    }
}
