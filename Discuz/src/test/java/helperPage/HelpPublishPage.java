package helperPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.PagePublish;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018-5-8.
 */
public class HelpPublishPage {
    private static Logger logger=Logger.getLogger(HelpLoginPage.class);
    public WebDriver driver;
    public static void publish(SeleniumUtil seleniumUtil,String title,String content){
        seleniumUtil.click(PagePublish.PUBLISH_LINK_DEFAULT);
        seleniumUtil.sendKeys(PagePublish.PUBLISH_LINK_TITLE,title);
        seleniumUtil.sendKeys(PagePublish.PUBLISH_LINK_CONTENT,content);
        seleniumUtil.click(PagePublish.PUBLISH_LINK_SUBMIT);
        logger.info("发表成功");
    }
    public static void img(SeleniumUtil seleniumUtil,String path){
        seleniumUtil.click(PagePublish.PUBLISH_LINK_IMG);
        seleniumUtil.sendKeys(PagePublish.PUBLISH_LINK_IMGPATH,"path");
        logger.info("输入图片");
    }

}
