package util;

import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by Administrator on 2018-5-7.
 */
public class LogConfiguration {
    public static void innitLog(){
        //给定日期格式
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        //将日期格式赋值给date
        String date=dateFormat.format(new Date());
        //储存log日志
        String datePath="./log/"+date+".log";
        Properties prop=new Properties();
        //配制日志格式
        prop.setProperty("log4j.rootLogger","info, console, keyfile");
        prop.setProperty("log4j.appender.console","org.apache.log4j.ConsoleAppender");
        prop.setProperty("log4j.appender.console.layout","org.apache.log4j.PatternLayout");
        prop.setProperty("log4j.appender.console.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        //  每天一个日志文件
        prop.setProperty("log4j.appender.keyfile","org.apache.log4j.DailyRollingFileAppender");
        prop.setProperty("log4j.appender.keyfile.layout","org.apache.log4j.PatternLayout");
        prop.setProperty("log4j.appender.keyfile.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        prop.setProperty("log4j.appender.keyfile.File",datePath);
        //配制生效
        PropertyConfigurator.configure(prop);





    }
}
