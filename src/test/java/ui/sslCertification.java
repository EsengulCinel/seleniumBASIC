package ui;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class sslCertification {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();

        //global profil
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setAcceptInsecureCerts(true);

        ChromeOptions options=new ChromeOptions();
        options.merge(dc);

        WebDriver driver= new ChromeDriver(options);

        driver.get("https://expired.badssl.com/");
        driver.close();
    }
}
