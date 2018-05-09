package page;

import org.openqa.selenium.By;

/**
 * 登录属性
 */
public class PageLogin {
    //用户名
    public static final By LOGIN_LINK_USERNAME=By.id("ls_username");
    //密码
    public static final By LOGIN_LINK_PASSWORD=By.id("ls_password");
    //自动登录
    public static final By LOGIN_LINK_ZIDONG=By.id("ls_cookietime");
    //点击登录按钮
    public static final By LOGIN_LINK_LOGIN=By.xpath("/html/body/div[5]/div/div[1]/form/div/div/table/tbody/tr[2]/td[3]/button");
    //找回密码
    public static final By LOGIN_LINK_RETURNPWD=By.xpath("/html/body/div[5]/div/div[1]/form/div/div/table/tbody/tr[1]/td[4]/a");
    //立即注册
    public static final By LOGIN_LINK_REGIST=By.xpath("/html/body/div[5]/div/div[1]/form/div/div/table/tbody/tr[2]/td[4]/a");

}
