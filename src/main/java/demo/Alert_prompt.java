package demo;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_prompt {

    ChromeDriver driver;

    public Alert_prompt() {
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

      public void testCase07() throws InterruptedException {

        //Visit the site
        driver.get(" https://web-locators-static-site-qa.vercel.app/Alerts");

        //Perform different actions on the alert
        //Click on Show alert
        WebElement show_Alert = driver.findElement(By.xpath("(//div[@class='Alert_section1'])//button"));

        Thread.sleep(3000);

        //Click on the Show alert
        show_Alert.click();

        //Perform alert on Screen
        Alert simpleAlert = driver.switchTo().alert();

        //Accepting the alert
        simpleAlert.accept();
      }
    }