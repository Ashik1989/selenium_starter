package demo;


import java.lang.IllegalStateException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkedin_image_video {



   ChromeDriver driver = new ChromeDriver();

    public Linkedin_image_video() {
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

         //String extractText;

       //Visit https://in.linkedin.com/ 
       driver.get("https://www.linkedin.com/home");
      // driver.get("https://in.bookmyshow.com/explore/home/chennai");
    
       //Maximise the window
       driver.manage().window().maximize();

       //Create the object in JavaScript
       JavascriptExecutor js = (JavascriptExecutor)driver;


       //Enter Username
       WebElement userName = driver.findElement(By.xpath("//*[@id='session_key']"));
       
       //Locating username field
       userName.sendKeys("ashikshetty07@gmail.com");

       //Locating password field
       WebElement passWord = driver.findElement(By.xpath("//*[@id='session_password']"));
       
       //Enter Password
       passWord.sendKeys("Meenakshi32@");

       //Click on Sign-in
       WebElement signinBtn = driver.findElement(By.xpath("//*[@id='main-content']/section[1]/div/div/form[1]/div[2]/button"));

       //Clicking on Sign-in button
       signinBtn.click();

       //Click on photo or video image in home
       //To post on Linked-in locate the Start a post field
       WebElement start_a_Post = driver.findElement(By.xpath("//button[@class='artdeco-button artdeco-button--muted artdeco-button--4 artdeco-button--tertiary ember-view share-box-feed-entry__trigger']"));

       //Clicking Start a post
       start_a_Post.click();

       //Locating the image to share
       WebElement selectImagetoShare = driver.findElement(By.xpath("//label[text()='Select image to share']"));
       
      //  //Click on image to share
      //  selectImagetoShare.click();
      selectImagetoShare.sendKeys("C://Users//meena//OneDrive//Pictures//Screenshots//Screenshot 2023-03-18 124717.png");

      //Done webelement
      WebElement done = driver.findElement(By.xpath("//*[@id='ember459']"));

      //Clicking on done
      done.click();

      //Locate the post element
      WebElement post = driver.findElement(By.xpath("//div[@class='share-box_actions']"));

      //Clicking on Post
      post.click();
    }

    
}
