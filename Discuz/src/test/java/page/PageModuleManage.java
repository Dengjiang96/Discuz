package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018-5-8.
 */
public class PageModuleManage {
    //管理中心
    public static final By MODULE_LINK_MANAGE= By.xpath("//*[@id=\"um\"]/p[1]/a[6]");
    //密码
    public static final By MODULE_LINK_LOGIN=By.xpath("//*[@id=\"loginform\"]/p[4]/input");
    //提交
    public static final By MOUDLE_LINK_SUBMIT=By.xpath("//*[@id=\"loginform\"]/p[9]/input");
    //论坛
    public static final By MODULE_LINK_LUNTAN=By.id("header_forum");
    //添加新的版块
    public static final By  MODULE_LINK_NEW=By.xpath("/html/body/div[3]/form/table/tbody[3]/tr/td[2]/div/a");
    //给板块命名
    public static final By MODULE_LINK_NAME=By.xpath("/html/body/div[3]/form/table/tbody[3]/tr[1]/td[3]/div/input");
    //提交版块
    public static final By MODULE_LINK_MSUBMIT=By.id("submit_editsubmit");
    //管理员退出
    public static final By MODULE_LINK_QUIT=By.xpath("//*[@id=\"frameuinfo\"]/p[1]/a");



}
