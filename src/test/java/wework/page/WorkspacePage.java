package wework.page;

import basepage.WeworkBasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/21 14:25
 */
public class WorkspacePage extends WeworkBasePage {
    public final By reportBtn = By.xpath("//*[@text='汇报']");

    public WorkspacePage(AppiumDriver driver) {
        super(driver);
    }

    /**
     * 点击进入日报周报月报页面
     */
    public void enterReportPage() {
        slideToBottom();
        clickBtn(reportBtn);
    }
}
