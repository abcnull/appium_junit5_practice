package wework.page;

import basepage.WeworkBasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/21 14:25
 */
public class DailyPage extends WeworkBasePage {
    public final By todayWorkInput = By.xpath("(//android.widget.EditText)[1]");
    public final By tomorrowPlanInput = By.xpath("(//android.widget.EditText)[2]");
    public final By othersInput = By.xpath("(//android.widget.EditText)[3]");
    public final By sureBtn = By.xpath("//android.view.View[@content-desc='提交']");
    public final By confirmBtn = By.id("bci");

    public DailyPage(AppiumDriver driver) {
        super(driver);
    }

    /**
     * 新增一个日报
     */
    public void addNewOne() {
        sendText(todayWorkInput, "xxx");
        sendText(tomorrowPlanInput, "xxx");
        sendText(othersInput, "xxx");
        slideToBottom();
        clickBtn(sureBtn);
        clickBtn(confirmBtn);
    }
}
