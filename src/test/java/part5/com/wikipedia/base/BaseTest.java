package part5.com.wikipedia.base;

import com.base.BasePage;
import com.wikipedia.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static com.base.BasePage.delay;
import static utilities.Utility.setUtiliyDriver;

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String WIKI_URL = "https://en.wikipedia.org/wiki/Main_Page";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @BeforeMethod
    public void loadApplication(){
        driver.get(WIKI_URL);
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
}
