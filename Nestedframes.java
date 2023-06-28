package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nestedframes {

 ChromeDriver driver = new ChromeDriver();

    public Nestedframes() {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        
        driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

      public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }
    
    public void testCase06() {

         String extractText;

       //Visit go to https://the-internet.herokuapp.com/nested_frames
       driver.get("https://the-internet.herokuapp.com/nested_frames");

       driver.switchTo().frame("frame-top");

       driver.switchTo().frame("frame-left");
        
       //Print the text
       getText();

       WebElement text1 = 








    }

}
