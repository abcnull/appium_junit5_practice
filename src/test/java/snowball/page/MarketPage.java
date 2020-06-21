package snowball.page;

import basepage.SnowballBasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/20 22:23
 */
public class MarketPage extends SnowballBasePage {
    public final By firstStock = By.id("name_and_symbol");
    public final By editAllBtn = By.id("edit_group");
    public final By selectAllBtn = By.id("check_all");
    public final By cancelBtn = By.id("cancel_follow");
    public final By sureBtn = By.id("tv_right");
    public final By finalBtn = By.id("action_close");

    public MarketPage(AppiumDriver driver) {
        super(driver);
    }

    /**
     * 删除所有股票的操作
     */
    public void deleteStock() {
        if (isExist(firstStock)) {
            clickBtn(editAllBtn);
            clickBtn(selectAllBtn);
            clickBtn(cancelBtn);
            clickBtn(sureBtn);
            clickBtn(finalBtn);
        }
    }
}