package snowball.page;

import basepage.SnowballBasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/20 13:43
 */
public class MainPage extends SnowballBasePage {
    public final By marketIcon = By.xpath("//*[@text='行情']");
    public final By searchInput = By.id("tv_search");

    public MainPage(AppiumDriver driver) {
        super(driver);
    }

    /**
     * 点击进入搜索页面
     */
    public void enterSearchPage() {
        clickBtn(searchInput);
    }

    /**
     * 点击进入行情页面
     */
    public void enterMarketPage() {
        clickBtn(marketIcon);
    }
}
