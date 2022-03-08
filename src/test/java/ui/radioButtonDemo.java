package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtonDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        WebElement radio2=driver.findElement(By.id("doi1"));
        WebElement radio1= driver.findElement(By.id("doi0"));
        radio1.click();
        System.out.println(radio1.isSelected()); //true ya da false döndürecek. seçili ise true değilse false
        System.out.println(radio2.isSelected());
        System.out.println(driver.findElements(By.xpath("//input[@name='doi']")).size());
        driver.close();
    }
}
