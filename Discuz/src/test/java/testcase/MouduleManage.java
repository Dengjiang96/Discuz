package testcase;

import helperPage.HelpLoginPage;
import helperPage.HelpModuleManagePage;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018-5-8.
 */
public class MouduleManage extends BasicLogin{
    @Test
    public void module() throws InterruptedException {
        HelpLoginPage.login(seleniumUtil,"admin","password");
        Thread.sleep(2000);
        HelpModuleManagePage.manage(seleniumUtil);
        List<String> handles=new ArrayList<String>(driver.getWindowHandles());
        String handle=handles.get(handles.size()-1);
        driver.switchTo().window(handle);
        HelpModuleManagePage.login(seleniumUtil,"password");
        HelpModuleManagePage.lunTan(seleniumUtil);
        driver.switchTo().frame("main");
        Thread.sleep(1000);
        HelpModuleManagePage.createNewModule(seleniumUtil,"欢乐中国行");
    }

}
