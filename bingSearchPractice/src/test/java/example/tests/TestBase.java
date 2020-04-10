package example.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	/**
     * The driver which is used to interact with the browser.
     **/
    public WebDriver webDriver;

    /**
     * The set up method which creates the driver for each test and turns the implicit wait feature off.
     **/
    @BeforeMethod
    public void setUp() {
    	//Devi 10-Apr-2020: Updated chrome driver setup using set property
        // Setup chrome driver via webdrivermanager for easy usage
      //  ChromeDriverManager.getInstance().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\git\\CustomWebElementsBingSearch\\bingSearchPractice\\chromedriver.exe");
        // Create it
        webDriver = new ChromeDriver();

        // Enable implicit wait
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    /**
     * After a test is finished, ensure that the browser will be closed.
     **/
    @AfterMethod
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

}
