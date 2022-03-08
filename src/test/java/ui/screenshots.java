package ui;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class screenshots {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.ebay.com/");

        Date currentDate=new Date();
        String screenshotsfilename=currentDate.toString().replace(" ","-").replace(":","-");
        System.out.println(screenshotsfilename);
        //ekran görüntü almak için gerekli olan tek line bu
        File screenshotfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //ama eger bunu kaydetmek veya görüntülemek istiyorsak
        //Commons IO kütüphanesini import etmeliyiz dependecyi ekledikten sonra...
        FileUtils.copyFile(screenshotfile,new File(".//screenshot/"+screenshotsfilename+".png"));
    }
}
