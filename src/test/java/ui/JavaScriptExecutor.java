package ui;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class JavaScriptExecutor {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();   // FirefoxDriver driver1=new FirefoxDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.manage().window().maximize();

        //print the tittle of the page
        JavascriptExecutor jsexec = (JavascriptExecutor) driver;
        String script="return document.tittle";
        String tittle= (String) jsexec.executeScript(script);
        System.out.println(tittle);

        //click the button
        driver.switchTo().frame("iframeResult");
        jsexec.executeScript("myFunction()");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        //highlight
        WebElement button= driver.findElement(By.xpath("/html/body/button"));
        jsexec.executeScript("arguments[0].style.border='5px solid green'",button);

        //scroll

        driver.navigate().to("https://www.w3schools.com/");
        WebElement button2=driver.findElement(By.xpath("//*[@id=\"bgcodeimg2\"]/div/a"));
        jsexec.executeScript("arguments[0].scrollIntoView(true);",button2);

    }
}
