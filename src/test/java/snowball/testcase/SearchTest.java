package snowball.testcase;

import basetest.SnowballBaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import snowball.page.MainPage;
import snowball.page.SearchPage;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/20 22:22
 */
public class SearchTest extends SnowballBaseTest {
    public MainPage mainPage;
    public SearchPage searchPage;

    @BeforeEach
    public void init() {
        mainPage = new MainPage(driver);
        searchPage = new SearchPage(driver);
    }

    @ParameterizedTest
    @ValueSource(strings = {"alibaba", "baidu", "jingdong"})
    public void selectFirstStockTest(String stock) {
        // 从首页进入搜索页面
        mainPage.enterSearchPage();
        // 搜索并选择第一行股票作为自选股
        searchPage.selectFirstStock(stock);
    }

    @AfterEach
    public void release() {}
}
