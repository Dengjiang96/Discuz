package page;

import org.openqa.selenium.By;

/**
 * 发帖
 */
public class PagePublish {
    //点击默认版块
    public static final By PUBLISH_LINK_DEFAULT=By.xpath("/html/body/div[7]/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr[1]/td[2]/h2/a");
    //输入帖子题目
    public static final By PUBLISH_LINK_TITLE=By.id("subject");
    //输入帖子内容
    public static final By PUBLISH_LINK_CONTENT=By.id("fastpostmessage");
    //加入图片
    public static final By PUBLISH_LINK_IMG=By.id("fastpostimg");
    //输入图片地址
    public static final By PUBLISH_LINK_IMGPATH=By.id("fastpostimg_param_1");
    //提交帖子
    public static final By PUBLISH_LINK_SUBMIT=By.id("fastpostsubmit");

}
