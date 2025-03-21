package ru.business.ui.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.FileDownloadMode;
import org.testng.annotations.AfterClass;
import ru.business.ui.action.ActionPage;
import ru.business.ui.constants.BaseUri;
import ru.business.ui.pages.BasePage;
import ru.business.ui.pages.profile.DashBoardPage;
import ru.business.ui.pages.regsiter.RegisterFormPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase implements ActionPage {

    static {
        Configuration.baseUrl = BaseUri.BASE_URI;
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1080";
        Configuration.fileDownload = FileDownloadMode.FOLDER;
    }

    protected BasePage basePage = new BasePage();
    protected RegisterFormPage registerFormPage = new RegisterFormPage();
    protected DashBoardPage dashBoardPage = new DashBoardPage();

    public void precondition() {
        basePage.openRegisterPage();
    }

    public void redirectDashBoard() {
        dashBoardPage.openDashBoardPage();
    }

    @AfterClass
    public void close() {
        closeWebDriver();
    }
}