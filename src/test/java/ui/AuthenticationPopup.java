package ui;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class AuthenticationPopup {
    public static String username="admin";  //herhangi bir excel vs dosyasından okudugunda
    public static String password="admin";

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();

        driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");

      //  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");



    }
}
