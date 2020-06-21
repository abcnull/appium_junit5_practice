package basepage;

import io.appium.java_client.AppiumDriver;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/20 13:43
 */
public class WeworkBasePage extends BasePage {
    public WeworkBasePage(AppiumDriver driver) {
        super(driver);
    }

    // todo: 由于很多 app 的页面有相似的结构，这里用来做页面中相似结构操作方法的封装
}
