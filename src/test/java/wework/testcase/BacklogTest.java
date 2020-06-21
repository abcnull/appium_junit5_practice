package wework.testcase;

import basetest.WeworkBaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import wework.page.BacklogPage;
import wework.page.MainPage;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/21 14:26
 */
public class BacklogTest extends WeworkBaseTest {
    public MainPage mainPage;
    public BacklogPage backlogPage;

    @BeforeEach
    public void init() {
        mainPage = new MainPage(driver);
        backlogPage = new BacklogPage(driver);
    }

    @Test
    public void addNewOneTest() {
        mainPage.enterBacklogPage();
        backlogPage.addNewOne();
    }

    @AfterEach
    public void release() {}
}
