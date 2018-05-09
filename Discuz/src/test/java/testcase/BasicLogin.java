package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.LogConfiguration;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018-5-7.
 */
public class BasicLogin {

    public WebDriver driver;
    public SeleniumUtil seleniumUtil=null;

    @BeforeMethod
    public void setUp() {
        LogConfiguration.innitLog();
        seleniumUtil = new SeleniumUtil();
        driver = seleniumUtil.getDriver();
        seleniumUtil.url();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        /*driver.quit();*/

    }

}
