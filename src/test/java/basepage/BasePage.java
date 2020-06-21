package basepage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/20 13:41
 */
public class BasePage {
    public AppiumDriver driver;
    public WebDriverWait wait;
    public TouchAction action;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
        action = new TouchAction(driver);
    }

    /**
     * 封装了简单的点击操作
     *
     * @param locator 被点击元素的定位
     */
    public void clickBtn(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

    /**
     * 封装了简单的输入文本的操作
     *
     * @param locator 输入框的元素定位
     * @param text 被输入的文本，支持按键输入
     */
    public void sendText(By locator, CharSequence... text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).sendKeys(text);
    }

    /**
     * 判定元素是否存在
     *
     * @param locator 判定元素的定位
     * @return 布尔值
     */
    public boolean isExist(By locator) {
        try {
            driver.findElement(locator);
        } catch(Exception e) {
            return false;
        }
        return true;
    }

    /**
     * 上滑操作
     */
    public void slideToBottom() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        PointOption option1 = PointOption.point(width/2, height*3/4);
        PointOption option2 = PointOption.point(width/2, height/4);
        action.press(option1).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10))).moveTo(option2).release().perform();
    }
}
