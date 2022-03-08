package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDrop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);

        WebElement drag= driver.findElement(By.id("draggable"));
        WebElement drop=driver.findElement(By.id("droppable"));

        Actions actions=new Actions(driver); //Actions yapıcı sınıfını import ettik.
        actions.dragAndDrop(drag,drop).perform(); //source ve target olarak düşün.

        driver.close();
    }
}
