/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.net.MalformedURLException;


public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
        // TestCases tests = new TestCases(); // Initialize your test class

        // //TODO: call your test case functions one after other here

        // tests.testCase01();

        // //END Tests


        // tests.endTest(); // End your test by clearning connections and closing browser

           //Login to Amazon
        // Search_Amazon searchamazon = new Search_Amazon();
        // searchamazon.testCase01();
        // searchamazon.endTest();

           //Count of hyperlinks
        // Bookmyshow hyperlinks_Count = new Bookmyshow();
        // hyperlinks_Count.testCase02();
        // hyperlinks_Count.endTest();

           //Posting on Linkedin
    //     Linkedin post_Linkedin = new Linkedin();
    //     post_Linkedin.testCase03();
    //     post_Linkedin.endTest();

           //Counting the Bookmyshow URL
        //    Bookmyshow_image countofURL_BMS = new Bookmyshow_image();
        //    countofURL_BMS.testCase04();
        //    countofURL_BMS.endTest();
           
           //Automating nested frame
         //   Nestedframe switchframes = new Nestedframe();
         //   switchframes.testCase05();
         //   switchframes.endTest();

         //Posting photo and video on Linkedin
         // Linkedin_image_video linkedin_upload = new Linkedin_image_video();
         // linkedin_upload.testCase06();
         // linkedin_upload.endTest();

         //Alert prompt
         // Alert_prompt alerts_actions = new Alert_prompt();
         // alerts_actions.testCase07();
         // alerts_actions.endTest();

         //IMDB Rating
         // IMDB_Automation ratings_on_IMDB = new IMDB_Automation();
         // ratings_on_IMDB.testCase08();
         // ratings_on_IMDB.endTest();

         //Atomate window handle in W3schools
         Automate_window_handle handling_Window = new Automate_window_handle();
         handling_Window.testCase09();
         handling_Window.endTest();

    }
       

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
}
