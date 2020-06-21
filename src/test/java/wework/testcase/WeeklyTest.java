package wework.testcase;

import basetest.WeworkBaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import wework.page.MainPage;
import wework.page.ReportPage;
import wework.page.WeeklyPage;
import wework.page.WorkspacePage;

/**
 * @author abcnull@qq.com
 * @version 1.0.0
 * @date 2020/6/21 14:26
 */
public class WeeklyTest extends WeworkBaseTest {
    public MainPage mainPage;
    public WorkspacePage workspacePage;
    public ReportPage reportPage;
    public WeeklyPage weeklyPage;

    @BeforeEach
    public void init() {
        mainPage = new MainPage(driver);
        workspacePage = new WorkspacePage(driver);
        reportPage = new ReportPage(driver);
        weeklyPage = new WeeklyPage(driver);
    }

    @Test
    public void addNewOneTest() {
        mainPage.enterWorkspacePage();
        workspacePage.enterReportPage();
        reportPage.enterWeeklyPage();
        weeklyPage.addNewOne();
    }

    @AfterEach()
    public void release() {}
}
