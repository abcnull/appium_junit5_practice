package snowball.testcase;

import basetest.SnowballBaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import snowball.page.MainPage;
import snowball.page.MarketPage;
import snowball.page.SearchPage;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/20 22:17
 */
public class MarketTest extends SnowballBaseTest {
    public MainPage mainPage;
    public MarketPage marketPage;

    @BeforeEach
    public void init() {
        mainPage = new MainPage(driver);
        marketPage = new MarketPage(driver);
    }

    @Test
    public void deleteStockTest() {
        // 从主页进入行情页
        mainPage.enterMarketPage();
        // 删除股票操作
        marketPage.deleteStock();
    }

    @AfterEach
    public void release() {}
}
