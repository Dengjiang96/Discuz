package helperPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.PageReply;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018-5-8.
 */
public class HelpReplyPage {
    private static Logger logger=Logger.getLogger(HelpLoginPage.class);
    public WebDriver driver;
    public static void reply(SeleniumUtil seleniumUtil,String content){
        seleniumUtil.click(PageReply.REPLY_LINK_DEFAULT);
        seleniumUtil.click(PageReply.REPLY_LINK_TEIZI);
        seleniumUtil.sendKeys(PageReply.REPLY_LINK_REPLY,content);
        seleniumUtil.click(PageReply.REPLY_LINK_SUBMIT);
        logger.info("回帖成功");
    }
    public static void def(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageReply.REPLY_LINK_DEFAULT);
    }
}
