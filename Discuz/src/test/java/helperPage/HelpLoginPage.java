package helperPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.PageLogin;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018-5-7.
 */
public class HelpLoginPage {
    private static Logger logger=Logger.getLogger(HelpLoginPage.class);
    public WebDriver driver;
    public static void login(SeleniumUtil seleniumUtil, String name, String pwd){
        seleniumUtil.sendKeys(PageLogin.LOGIN_LINK_USERNAME,"admin");
        seleniumUtil.sendKeys(PageLogin.LOGIN_LINK_PASSWORD,"password");
        seleniumUtil.click(PageLogin.LOGIN_LINK_ZIDONG);
        seleniumUtil.click(PageLogin.LOGIN_LINK_LOGIN);
        logger.info("登录成功");
    }
    //输入用户名
    public static void username(SeleniumUtil seleniumUtil,String name){
        seleniumUtil.sendKeys(PageLogin.LOGIN_LINK_USERNAME,"admin");
        logger.info("输入用户名");
    }
    //输入密码
    public static void pwd(SeleniumUtil seleniumUtil,String pwd){
        seleniumUtil.sendKeys(PageLogin.LOGIN_LINK_PASSWORD,"password");
        logger.info("输入密码");
    }
    //找不到密码
    public static void returnPwd(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGIN_LINK_RETURNPWD);
        logger.info("找回密码");
    }
    //注册
    public static void regist(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGIN_LINK_REGIST);
        logger.info("新人注册");
    }

}
