package ru.business.ui.pages.profile;

import io.qameta.allure.Step;
import ru.business.ui.action.ActionPage;
import ru.business.ui.constants.BaseUri;

import static com.codeborne.selenide.Selenide.open;

public class DashBoardPage implements ActionPage {

    @Step("Открыть вкладку 'Дашборд'")
    public void openDashBoardPage() {
        System.out.println("Открыть вкладку 'Дашборд'");
        open(BaseUri.BASE_URI + "/account/dashboard");
    }
}
