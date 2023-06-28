package demo;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nestedframe {

    ChromeDriver driver;

    public Nestedframe() {
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

    public void testCase05() {
        System.out.println("Start Testcase 05");

        // Navigate to url
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        // Go to top frame
        driver.switchTo().frame("frame-top");

        // Switch to left frame
        driver.switchTo().frame("frame-left");

        // Locate and get the text and print the text
        String textinsideLeftframe = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
        //body[contains(text(),'LEFT')]

        System.out.println("Text inside left frame:" + textinsideLeftframe);

        // Switch to parent frame
        driver.switchTo().parentFrame();

        // Switch to middle frame
        driver.switchTo().frame("frame-middle");

        // Locate and get the text and print the text
        String textinsideMiddleframe = driver.findElement(By.xpath("//div[@id='content']")).getText();
        System.out.println("Text inside middle frame:" + textinsideMiddleframe);

        // Switch to parent frame
        driver.switchTo().parentFrame();

        // Switch to right frame
        driver.switchTo().frame("frame-right");

        // Locate and get the text and print the text
        String textinsideRightframe = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();
        System.out.println("Text inside right frame:" + textinsideRightframe);

        // Switch to whole frame context
        driver.switchTo().defaultContent();

        // Switch to bottom frame
        driver.switchTo().frame("frame-bottom");

        // Locate and get the text and print the text
        String textinsideBottomframe = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
        System.out.println("Text inside bottom frame:" + textinsideBottomframe);

    }
}