package helperPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.PageOut;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018-5-8.
 */
public class HelpOutPage {
    private static Logger logger=Logger.getLogger(HelpLoginPage.class);
    public WebDriver driver;
    public static void out(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageOut.OUT_LINK_OUT);
        logger.info("退出登录");
    }
}
