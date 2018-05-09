package helperPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.PageModuleManage;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018-5-8.
 */
public class HelpModuleManagePage {
    private static Logger logger=Logger.getLogger(HelpModuleManagePage.class);
    public WebDriver driver;
    public static void manage(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageModuleManage.MODULE_LINK_MANAGE);
    }
    public static void login(SeleniumUtil seleniumUtil,String pwd){
        seleniumUtil.sendKeys(PageModuleManage.MODULE_LINK_LOGIN,pwd);
        seleniumUtil.click(PageModuleManage.MOUDLE_LINK_SUBMIT);
        logger.info("登录成功，进入管理模块");
    }
    public static void lunTan(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageModuleManage.MODULE_LINK_LUNTAN);
        logger.info("进入论坛");
    }
    public static void createNewModule(SeleniumUtil seleniumUtil,String name){
        seleniumUtil.click(PageModuleManage.MODULE_LINK_NEW);
        seleniumUtil.sendKeys(PageModuleManage.MODULE_LINK_NAME,name);
        seleniumUtil.click(PageModuleManage.MODULE_LINK_MSUBMIT);
        logger.info("添加新模块成功");

    }
}
