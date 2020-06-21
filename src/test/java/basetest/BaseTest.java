package basetest;

import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/20 13:33
 */
public class BaseTest {
    public AppiumDriver driver;
    public String appPackage;
    public String appActivity;

    // 构造器
    public BaseTest(String appPackage, String appActivity) {
        this.appPackage = appPackage;
        this.appActivity = appActivity;
    }

    @BeforeEach
    public void initConfig() throws MalformedURLException {
        // 期望属性
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "127.0.0.1:7555");
//        capabilities.setCapability("udid", "127.0.0.1:7555");
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", appActivity);
        capabilities.setCapability("automationName", "UiAutomator1");
        capabilities.setCapability("noReset", true);
        // 启动驱动
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        // 设置等待
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterEach
    public void releaseConfig() {
        // 驱动退出
        driver.quit();
    }
}
