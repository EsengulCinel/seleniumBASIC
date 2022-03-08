package ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class readWrite {
    public static void main(String[] args) throws IOException {

        Properties properties=new Properties();
        FileInputStream inputStream=new FileInputStream("C:\\Users\\amdocsecinel\\IdeaProjects\\seleniumBASIC\\src\\test\\java\\properties\\testDataProperties.properties");
        //hangi dosyayı açmak istiyorsan onu ister. O yüzden locationu belirtmeliyiz.
        properties.load(inputStream);
        System.out.println(properties.getProperty("browser"));
        System.out.println(properties.getProperty("url"));


        FileOutputStream outputStream=new FileOutputStream("C:\\Users\\amdocsecinel\\IdeaProjects\\seleniumBASIC\\src\\test\\java\\properties\\testDataProperties.properties");
        properties.setProperty("testdate","11111111");//key , value
        // sonradan kullanmak için saklamak istiyorsun örneğin
        properties.store(outputStream,"buraya istediğin yorumu yazabilirsin yada null bırak");
    }
}
