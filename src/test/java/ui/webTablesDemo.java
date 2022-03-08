package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class webTablesDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www2.asx.com.au/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//step 1 = frame'i değiştir hangisini kullanıyorsan
//step 2 = rows numarasını al
//step 3 = columns numarasını al
//step 4 =Iterate rows ve columns ve text ve yazdır

//        WebElement frame1=driver.findElement(By.id("iframeResult"));
//        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//*[@id=\"pnProductNavContents\"]/li[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"home_top_five\"]/div/button/span")).click();


        List <WebElement> rows=driver.findElements(By.xpath("//*[@id=\"home_top_five_test\"]/div/div[1]/div/div[1]/table/tr"));
        System.out.println(rows.size());
        int rowsize=rows.size(); //storege' e attık
        List <WebElement> columns=driver.findElements(By.xpath("//*[@id=\"home_top_five_test\"]/div/div[1]/div/div[1]/table/tr[2]/td"));
        System.out.println(columns.size());
        int colsize=rows.size();
        for(int i=1;i<rowsize;i++){
            for (int j=1;j<colsize;j++){
                System.out.println(driver.findElement(By.xpath("//*[@id=\"home_top_five_test\"]/div/div[1]/div/div[1]/table/tr["+ i + "]/td[" + j+ "]"))
                        .getText()+ " ");

            }
            System.out.println();
        }

    }
}
