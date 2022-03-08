package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class selectDropDown {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();

        WebElement ddrop= driver.findElement(By.name("employees_c"));
        Select select =new Select(ddrop);
        select.selectByValue("level1");
        Thread.sleep(2000);
        select.selectByVisibleText("11 - 50 employees");
        Thread.sleep(2000);
        select.selectByIndex(5);
        Thread.sleep(2000);


        driver.navigate().to("https://semantic-ui.com/modules/dropdown.html");
        WebElement mdrop= driver.findElement(By.name("skills"));
        Select select1=new Select(mdrop);

        select1.selectByValue("angular");
        select1.deselectByIndex(4);
        List<WebElement> allItems= select1.getAllSelectedOptions();
        System.out.println(allItems.size());

        select1.deselectAll();
        select1.selectByValue("angular");
        select1.selectByIndex(4);

        select1.deselectByIndex(4);
        List<WebElement> allItems1= select1.getAllSelectedOptions();
        System.out.println(allItems1.size());


        driver.close();
    }
}
