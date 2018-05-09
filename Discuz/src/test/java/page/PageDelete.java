package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018-5-8.
 */
public class PageDelete {
    public static final By DELETE_LINK_CLICK= By.xpath("//*[@id=\"normalthread_2\"]/tr/td[2]/input");
    //删除
    public static final By DELETE_LINK_DELETE=By.xpath("//*[@id=\"mdly\"]/p[1]/strong[1]/a");
    //删除理由
    public static final By DELETE_LINK_COURCE=By.xpath("//*[@id=\"reason\"]");
    //通知作者
    public static final By DELETE_LINK_RECALL=By.xpath("//*[@id=\"sendreasonpm\"]");
    //违规操作
    public static final By DELETE_LINK_ILLEGAL=By.xpath("//*[@id=\"crimerecord\"]");
    //确定
    public static final By DELETE_LINK_SUBMIT=By.xpath("//*[@id=\"modsubmit\"]");

}
