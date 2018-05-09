import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class text1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","F:\\mvn\\mvn\\chromedriver.exe");
        WebDriver chrome=new ChromeDriver();
        chrome.get("https:www.baidu.com");
        //查找输入框
        WebElement element=chrome.findElement(By.id("kw"));
        Thread.sleep(2000);
        //输入内容，键盘提交
        element.sendKeys(Keys.chord("软件测试"),Keys.ENTER);
        Thread.sleep(2000);
        //清空输入内容
        element.clear();


        System.out.println("获取标签名称："+element.getTagName());
        System.out.println("获取相应属性："+element.getAttribute("target"));
        System.out.println("获取文本内容："+element.getText());
        System.out.println("获取当前位置信息："+element.getLocation());
        System.out.println("获取CSS属性的值："+element.getCssValue("font"));
        System.out.println("获取元素的高和宽："+element.getSize());




    }
}