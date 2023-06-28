package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IMDB_Automation {

  ChromeDriver driver;

  public IMDB_Automation() {
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

public void testCase08() {
    
		ChromeOptions option= new ChromeOptions();    //these two lines will handle the browers handle but we have to pass 
		option.addArguments("--remote-allow-origins=*");; //reference in WebDriver driver = new ChromeDriver(option);
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        //implicitlyWait(Duration.ofSeconds(5));
	
		driver.get("https://www.imdb.com/chart/top");
		WebElement dropDown= driver.findElement(By.xpath("//select[@name='sort']"));
		dropDown.click();
		Select sel = new Select(dropDown);
		sel.selectByVisibleText("IMDb Rating");
        
		
		//String text= driver.findElement(By.xpath("//a[text()='The Shawshank Redemption']")).getText();

        WebElement title_of_Movie = driver.findElement(By.xpath("//tbody[@class='lister-list']//tr[1]//a[@title]"));
        String text = title_of_Movie.getText();
		System.out.println("Highest rated movie on Imdb="+text);
		
		String count= driver.findElement(By.xpath("(//span[text()='250'])[1]")).getText();
		System.out.println("movies are included in the table="+count);
		
		
		sel.selectByValue("us:descending");
        //WebElement clickonDescendingElement = driver.findElement(By.xpath("//span[@class='global-sprite lister-sort-reverse descending']"));
		// clickonDescendingElement.click();
        //sel.selectByValue("us:descending");

		// sel.selectByValue(count);
		String oldMovie= driver.findElement(By.xpath("//a[text()='The Kid']")).getText();
		System.out.println("oldest movie on the list is-"+oldMovie);

        // WebElement clickonAssendingElement = driver.findElement(By.xpath("//span[@class='global-sprite lister-sort-reverse descending']"));
		// clickonAssendingElement.click();
		
		String newMovie= driver.findElement(By.xpath("//a[text()='Spider-Man: Across the Spider-Verse']")).getText();
		System.out.println("most recent movie on the list is-"+newMovie);
		
		sel.selectByValue("nv:descending");
		
		String userRating= driver.findElement(By.xpath("//a[text()='The Shawshank Redemption']")).getText();
		System.out.println("The movie has the most user ratings is-"+userRating);

   }
}
