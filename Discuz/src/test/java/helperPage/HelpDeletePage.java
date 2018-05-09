package helperPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import page.PageDelete;
import page.PagePublish;
import util.SeleniumUtil;


/**
 * 删除评论
 */
public class HelpDeletePage {
    private static Logger logger= org.apache.log4j.Logger.getLogger(HelpLoginPage.class);
    public WebDriver driver;
    public static void delete(SeleniumUtil seleniumUtil,String cource){
        seleniumUtil.click(PagePublish.PUBLISH_LINK_DEFAULT);
        seleniumUtil.click(PageDelete.DELETE_LINK_CLICK);
        seleniumUtil.click(PageDelete.DELETE_LINK_DELETE);
        seleniumUtil.sendKeys(PageDelete.DELETE_LINK_COURCE,cource);
        seleniumUtil.click(PageDelete.DELETE_LINK_RECALL);
        seleniumUtil.click(PageDelete.DELETE_LINK_SUBMIT);
        logger.info("删除成功");
    }
    public static void illegal(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageDelete.DELETE_LINK_ILLEGAL);
        logger.info("违法操作");
    }
    public static void submit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageDelete.DELETE_LINK_SUBMIT);
        logger.info("删除");
    }
    public static void recall(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageDelete.DELETE_LINK_RECALL);
        logger.info("通知作者");
    }
    public static void delete1(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePublish.PUBLISH_LINK_DEFAULT);
        seleniumUtil.click(PageDelete.DELETE_LINK_CLICK);
        seleniumUtil.click(PageDelete.DELETE_LINK_DELETE);
    }

}
