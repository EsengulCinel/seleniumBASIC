package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class printAllLinks {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();

        List<WebElement> links = driver.findElementsByTagName("a");
        System.out.println("all links: " + links.size());
        int i;
        for (i = 0; i < links.size(); i++) {
            System.out.println("links are the on page: " + links.get(i).getAttribute("href"));

            //i indexleri istiyoruz
            //attribute linkleri yazdırıyoruz

        }

        driver.close();
    }
}