package wework.page;

import basepage.WeworkBasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/21 16:27
 */
public class ReportPage extends WeworkBasePage {
    public final By dailyBtn = By.xpath("//*[@text='日报']");
    public final By weeklyBtn = By.xpath("//*[@text='周报']");

    public ReportPage(AppiumDriver driver) {
        super(driver);
    }

    /**
     * 进入日报页面
     */
    public void enterDailyPage() {
        clickBtn(dailyBtn);
    }

    /**
     * 进入周报页面
     */
    public void enterWeeklyPage() {
        clickBtn(weeklyBtn);
    }
}
