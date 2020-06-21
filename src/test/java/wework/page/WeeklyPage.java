package wework.page;

import basepage.WeworkBasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/21 14:25
 */
public class WeeklyPage extends WeworkBasePage {
    public final By weekWorkInput = By.xpath("(//android.widget.EditText)[1]");
    public final By nextPlanInput = By.xpath("(//android.widget.EditText)[2]");
    public final By othersInput = By.xpath("(//android.widget.EditText)[3]");
    public final By sureBtn = By.xpath("//android.view.View[@content-desc='提交']");
    public final By confirmBtn = By.id("bci");

    public WeeklyPage(AppiumDriver driver) {
        super(driver);
    }

    /**
     * 新建一个周报
     */
    public void addNewOne() {
        sendText(weekWorkInput, "xxx");
        sendText(nextPlanInput, "xxx");
        sendText(othersInput, "xxx");
        slideToBottom();
        clickBtn(sureBtn);
        clickBtn(confirmBtn);
    }
}
