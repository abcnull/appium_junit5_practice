package wework.page;

import basepage.WeworkBasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/20 13:43
 */
public class MainPage extends WeworkBasePage {
    public final By scheduleBtn = By.id("c7o");
    public final By backlogBtn = By.id("h7p");
    public final By workspaceBtn = By.xpath("//*[@text='工作台']");

    public MainPage(AppiumDriver driver) {
        super(driver);
    }

    /**
     * 进入日程页面
     */
    public void enterSchedulePage() {
        clickBtn(scheduleBtn);
    }

    /**
     * 进入待办事项页面
     */
    public void enterBacklogPage() {
        clickBtn(backlogBtn);
    }

    /**
     * 进入工作台页面
     */
    public void enterWorkspacePage() {
        clickBtn(workspaceBtn);
    }
}
