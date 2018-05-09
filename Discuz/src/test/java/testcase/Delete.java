package testcase;

import helperPage.HelpDeletePage;
import helperPage.HelpLoginPage;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018-5-8.
 */
public class Delete extends BasicLogin{
    @Test
    public void loginID() throws InterruptedException {
        HelpLoginPage.login(seleniumUtil,"admin","password");
        Thread.sleep(2000);
        HelpDeletePage.delete(seleniumUtil,"内容不合适");

    }


}
