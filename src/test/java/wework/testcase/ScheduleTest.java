package wework.testcase;

import basetest.WeworkBaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import wework.page.MainPage;
import wework.page.SchedulePage;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/21 14:26
 */
public class ScheduleTest extends WeworkBaseTest {
    public MainPage mainPage;
    public SchedulePage schedulePage;

    @BeforeEach
    public void init() {
        mainPage = new MainPage(driver);
        schedulePage = new SchedulePage(driver);
    }

    @Test
    public void addNewOneTest() {
        mainPage.enterSchedulePage();
        schedulePage.addNewOne();
    }

    @AfterEach
    public void release() {}
}
