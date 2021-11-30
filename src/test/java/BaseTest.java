import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import rozetka.Utils.Config;
import rozetka.Utils.TestHelper;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected static WebDriver chrome;
    private static final Properties config = Config.loadProperties("test.properties");

    @BeforeMethod(description = "configure browser before test")
    public void setup() {
        System.setProperty("webdriver.chrome.driver", config.getProperty("chromedriver"));
        chrome = new ChromeDriver();

        chrome.manage().window().maximize();
        chrome.manage().deleteAllCookies();
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chrome.get(config.getProperty("baseurl"));

    }
    @AfterMethod(description = "cleanup and close browser")
    public void cleanup(){
        if (chrome!=null){
            chrome.manage().deleteAllCookies();
            TestHelper.sleep5Seconds();
            chrome.close();

        }
    }
}
