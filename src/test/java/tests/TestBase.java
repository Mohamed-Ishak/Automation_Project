package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase extends AbstractTestNGCucumberTests {

  public static WebDriver driver ;

    @BeforeTest
    public void startDriver(){

        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
         driver.navigate().to("http://automationpractice.com/index.php");
    }


    @AfterTest
    public void closeDriver(){
        driver.quit();
    }


}
