package part3_4.com.demoqa.base;

import com.demoqa.pages.HomePage;
import com.base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.JavascriptLogEntry;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilities.JavascriptUtility;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.logging.FileHandler;

import static com.base.BasePage.delay;
import static utilities.Utility.setUtiliyDriver;

public class BaseTest {
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String DEMOQA_URL = "https://demoqa.com/";
    
    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Implicit wait - it is a global wait, it will be applied to all elements in the test, and it will wait for the element to be present in the DOM before throwing NoSuchElementException
        // Implicit wait - we already implemented this before, but it is nice to have here in the @BeforeClass
        // Never use IMPLICIT wait with other wait methods (like EXPLICIT or FLUENT)!!! - can cause unpredictable wait times
        // Implicit - all elements, Explicit - on individual elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // with implicit wait, Selenium will retry for up to 10 seconds instead of failing instantly
    }
    @BeforeMethod
    public void loadApplication(){
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtiliyDriver();
        homePage = new HomePage();
    }
    @AfterClass
    public void tearDown(){
        delay(3000);
        driver.quit();
    }
    
    @AfterMethod
    public void takeFieldResultFailedSceenshot(ITestResult testResult){
        if (ITestResult.FAILURE == testResult.getStatus()) {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir") +
                    "/resources/screenshots/" + java.time.LocalDate.now() + "-" + testResult.getName() + ".png");
            try {
                Files.copy(
                        source.toPath(),
                        destination.toPath(),
                        StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    
}
