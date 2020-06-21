package snowball.page;

import basepage.SnowballBasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/20 22:23
 */
public class SearchPage extends SnowballBasePage {
    public final By searchInput = By.id("search_input_text");
    public final By firstRow = By.id("icon");
    public final By followBtn = By.id("follow_btn");

    public SearchPage(AppiumDriver driver) {
        super(driver);
    }

    /**
     * 搜索并添加自选股操作
     *
     * @param stock 自选股文本
     */
    public void selectFirstStock(String stock) {
        sendText(searchInput, stock);
        clickBtn(firstRow);
        clickBtn(followBtn);
    }
}
