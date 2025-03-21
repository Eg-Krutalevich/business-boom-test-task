package ru.business.ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import ru.business.ui.constants.BaseUri;

public class BasePage {

    @Step("Открыть главную страницу")
    public void openRegisterPage() {
        System.out.println("Открыть главную страницу");
        Selenide.open(BaseUri.BASE_URI);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
}