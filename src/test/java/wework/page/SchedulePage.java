package wework.page;

import basepage.WeworkBasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/21 14:07
 */
public class SchedulePage extends WeworkBasePage {
    // +
    public final By addBtn = By.id("h9p");
    // 日程主题输入框
    public final By themeInput = By.id("b58");
    // 上午
    public final By amIcon = By.xpath("//*[@text='上午']");
    // 确定
    public final By sureBtn = By.id("ahn");

    public SchedulePage(AppiumDriver driver) {
        super(driver);
    }

    /**
     * 添加一个新日程
     */
    public void addNewOne() {
        clickBtn(addBtn);
        sendText(themeInput, "xxx会议");
        clickBtn(amIcon);
        clickBtn(sureBtn);
    }
}
