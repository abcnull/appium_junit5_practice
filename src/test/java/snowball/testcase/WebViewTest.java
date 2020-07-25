package snowball.testcase;

import basetest.SnowballBaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import snowball.page.MainPage;
import snowball.page.WebViewPage;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/7/25 17:59
 */
public class WebViewTest extends SnowballBaseTest {
    public MainPage mainPage;
    public WebViewPage webViewPage;

    @BeforeEach
    public void init() {
        mainPage = new MainPage(driver);
        webViewPage = new WebViewPage(driver);
    }

    @AfterEach
    public void release() {}

    @Test
    public void testWebView() {
        // 从首页进入交易页面
        mainPage.enterTransactionPage();
        // WebView 测试
        webViewPage.webViewFun();
        // 断言
    }
}
