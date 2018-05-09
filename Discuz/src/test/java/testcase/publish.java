package testcase;

import helperPage.HelpLoginPage;
import helperPage.HelpPublishPage;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018-5-8.
 */
public class publish extends BasicLogin{
    @Test
    public void loginID() throws InterruptedException {
        HelpLoginPage.login(seleniumUtil,"admin","password");
        Thread.sleep(2000);
        HelpPublishPage.publish(seleniumUtil,"今天天气真好","hahahaha");
    }
}
