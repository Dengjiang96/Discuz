package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018-5-8.
 */
public class PageReply {
    //默认版块
    public static final By REPLY_LINK_DEFAULT=By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[2]/h2/a");
    //选一个帖子
    public static final By REPLY_LINK_TEIZI=By.xpath("//*[@id=\"normalthread_3\"]/tr/th/a[2]");
    //回复
    public static final By REPLY_LINK_REPLY=By.id("fastpostmessage");
    //发表
    public static final By REPLY_LINK_SUBMIT=By.id("fastpostsubmit");


}
