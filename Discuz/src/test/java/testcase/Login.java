package testcase;

import helperPage.HelpLoginPage;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018-5-7.
 */
public class Login extends BasicLogin {
    @Test
    public void loginID(){
        HelpLoginPage.login(seleniumUtil,"admin","password");
    }
}
