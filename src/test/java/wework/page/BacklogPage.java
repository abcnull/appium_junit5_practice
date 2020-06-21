package wework.page;

import basepage.WeworkBasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/21 14:08
 */
public class BacklogPage extends WeworkBasePage {
    // +
    public final By backlogBtn = By.id("h9p");
    // 待办事项标题
    public final By themeInput = By.id("b58");
    // 保存
    public final By sureBtn = By.id("h8t");

    public BacklogPage(AppiumDriver driver) {
        super(driver);
    }

    /**
     * 添加待办事项
     */
    public void addNewOne() {
        clickBtn(backlogBtn);
        sendText(themeInput, "xxx事项");
        clickBtn(sureBtn);
    }

}
