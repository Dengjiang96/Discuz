package util;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2018-5-8.
 */
public class BrowerEnger {
    public static String browserName;
    public static String serverURL;

    public static void initConfigDate() throws IOException {
        Properties p = new Properties();
        //加载配制文件
        InputStream ips = new FileInputStream(".\\config.properties");
        p.load(ips);

        browserName = p.getProperty("browserName");
        serverURL = p.getProperty("URL");

        ips.close();
    }

    static {
        try {
            BrowerEnger.initConfigDate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(browserName);
    }
}