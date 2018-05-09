package util;

import org.apache.commons.lang3.NotImplementedException;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.print.DocFlavor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

/**
 * Created by Administrator on 2018-5-7.
 */
public class SeleniumUtil extends BrowerEnger{
    private static Logger logger=Logger.getLogger(SeleniumUtil.class);
    public WebDriver driver;
    public WebDriver getDriver(){
        if (browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "F:\\mvn\\mvn\\chromedriver.exe");
            driver= new ChromeDriver();
            logger.info("启动谷歌浏览器");
        }else if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "F:\\mvn\\mvn\\geckodriver.exe");
            driver=new FirefoxDriver();
            logger.info("启动火狐浏览器");
        }else{
            logger.info("启动浏览器");
        }
        return driver;
    }

    public void url(){
        driver.get(serverURL);
        logger.info("打开网页"+serverURL);
    }

    public String getLocationElement(WebElement element,String expection){
        String text=element.toString();
        String except=null;
        try{
            except=text.substring(text.indexOf(expection)+1,text.length()-1);
            logger.info("找到字符串");
        }catch (Exception e){
            e.printStackTrace();
            logger.info("查找字符串失败");
        }
        return except;
    }

    public WebElement findElement(By by){
        WebElement element=null;
        try{
            element=driver.findElement(by);
            logger.info("找到该元素+"+getLocationElement(element,">"));
        }catch(NoSuchElementException e){
            e.printStackTrace();
            logger.info("未找到该元素");
        }

        return element;
    }

    public List<WebElement> findElements(By by){
        List<WebElement> eles=driver.findElements(by);
        return eles;
    }

    public void clear(By by){
        WebElement element=driver.findElement(by);
        element.clear();
        logger.info("清空元素");
    }

    public void click(By by){
        WebElement element=driver.findElement(by);
        element.click();
        logger.info("点击操作");
    }

    public void sendKeys(By by,String text){
        WebElement element=driver.findElement(by);
        clear(by);
        element.sendKeys(text);
        logger.info("输入的内容是："+text);
    }

    public String getText(By by){
        WebElement elemrnt=driver.findElement(by);
        String text=elemrnt.getText();
        logger.info("得到的内容是："+text);
        return text;
    }






}
