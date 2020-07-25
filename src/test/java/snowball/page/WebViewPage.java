package snowball.page;

import basepage.SnowballBasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/7/25 17:58
 */
public class WebViewPage extends SnowballBasePage {
    public final By FundAccount = By.xpath("//ul/li");

    public WebViewPage(AppiumDriver driver) {
        super(driver);
    }

    /**
     * WebView 的操作
     */
    public void webViewFun() {
        // 进入 webview 页面
        enterWebView();

        driver.getWindowHandles().forEach((handle) -> {
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());
            System.out.println("========");
            System.out.println(driver.getPageSource());
            System.out.println("++++++++");
        });

        // 切换窗口
        Set<String> set = driver.getWindowHandles();
        Object[] arr = set.toArray();

        driver.switchTo().window(arr[0].toString());
        // 点击基金开户
        clickBtn(FundAccount);
    }
}
