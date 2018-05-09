package testcase;

import helperPage.HelpLoginPage;
import helperPage.HelpOutPage;
import helperPage.HelpReplyPage;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018-5-8.
 */
public class Reply extends BasicLogin{
    @Test
    public void reply() throws InterruptedException {
        HelpLoginPage.login(seleniumUtil,"admin","password");
        Thread.sleep(2000);
        HelpReplyPage.reply(seleniumUtil,"今天很开心");
        Thread.sleep(2000);
        HelpOutPage.out(seleniumUtil);
    }


}
